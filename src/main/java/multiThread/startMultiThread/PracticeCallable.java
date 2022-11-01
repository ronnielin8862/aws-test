package multiThread.startMultiThread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class PracticeCallable implements Callable {

    public String AA;

    public void setAA (String AA){
        this.AA = AA;
    }

    @Override
    public String call() throws Exception {
        System.out.println("開始了啦幹");
        Thread.sleep(1000 * 3);
        System.out.println("幹完了 " + Thread.currentThread().getName());
        return AA;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int times = 10;
        ExecutorService executor = Executors.newFixedThreadPool(times);
        List<Future<String>> results = new ArrayList<>();
        Future<String> returnInt = null;

        for (int i = 0; i < times; i++) {
            PracticeCallable callable = new PracticeCallable();
            callable.setAA("館長有 "+ i +" 根懶覺");
            returnInt = executor.submit(callable);
            results.add(returnInt); // 將task放入list
        }

        executor.shutdown();

        for (Future<String> result: results){
            System.out.println("return int = "  + result.get()); // 利用.get()方法會等待結果的特性，會在這裡等待 Thread.sleep的結束
        }

    }
}
