package efficacy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.LinkedBlockingQueue;

public class FindPrimeTest {

    static long start,end;

    List<Integer> result;
    List<Integer> result2;

    @Test
    public void start() throws InterruptedException {

        int range = 100000;
        result = findInRange(range);
        System.out.println("result = " + result.size() + " 個");

        result2 = findInRange2Thread(range);
        System.out.println("result2 = " + result2.size() + " 個");

        List<Integer> result3 = new ArrayList<>();
        for (Integer num : result){
            if (!result2.contains(num)){
                result3.add(num);
            }
        }

        System.out.println("r2 未計算到的質數 ＝ " +result3);
    }

    public List<Integer> findInRange2Thread(int range){
        List<Integer> prime = new ArrayList<>();
        if (range <= 1){
            return prime;
        }
        if (range == 2 ){
            prime.add(2);
            return prime;
        }

        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        for (int i =2; i<range; i++){
         queue.offer(i);
        }

        start = System.currentTimeMillis();

        CompletableFuture<Boolean> a = CompletableFuture.supplyAsync(()->{
            while (!queue.isEmpty()) {
                Integer t;
                try {
                    t = queue.take();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (t == null) {
                    System.out.println("2結束");
                    break;
                }
                if (find(t)) {
                    prime.add(t);
                }
            }
            return true;
        });
        CompletableFuture<Boolean> b = CompletableFuture.supplyAsync(()->{
            while (!queue.isEmpty()) {
                Integer t;
                try {
                    t = queue.take();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (t == null) {
                    System.out.println("2結束");
                    break;
                }
                if (find(t)) {
                    prime.add(t);
                }
            }
            return true;
        });
//        while (!queue.isEmpty()){
//            var y = queue.take();
//            if (y ==null){
//                System.out.println("主結束");
//                break;
//            }
//             if (find(y)){
//                 prime.add(y);
//             }
//        }
        a.join();
        b.join();
        end = (System.currentTimeMillis() - start) ;
        System.out.println("multi thread use time = "+end);
        return prime;
    }


    public List<Integer> findInRange(int range){
        start = System.currentTimeMillis();
        List<Integer> prime = new ArrayList<>();
        if (range <= 1){
            return prime;
        }
        if (range == 2 ){
            prime.add(2);
            return prime;
        }

        for (int i =2; i<range ; i++ ){
            if (find(i)){
              prime.add(i);
            }
        }

        end = (System.currentTimeMillis() - start);
        System.out.println("single thread use time = "+end);
        return prime;
    }

    public boolean find(int range){

        for (int i=2; i<range; i++){
            if (range % i ==0){
                return false;
            }
        }
        return true;
    }
}
