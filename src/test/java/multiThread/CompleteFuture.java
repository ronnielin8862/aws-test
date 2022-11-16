package multiThread;

import org.junit.Test;

import java.util.concurrent.CompletableFuture;

//@SpringBootTest
//@RunWith(SpringRunner.class)
public class CompleteFuture {
    @Test
    public void helloWorld(){
        long st = System.currentTimeMillis();

        CompletableFuture<String> a = CompletableFuture.supplyAsync(()-> he());
        CompletableFuture<String> b = CompletableFuture.supplyAsync(()-> spa());
        CompletableFuture<String> c = CompletableFuture.supplyAsync(()-> wo());

        System.out.println(a.join() + b.join() + c.join());


        System.out.println("total time = " + (System.currentTimeMillis() - st));
    }

    @Test
    public void oneThreadReturn(){
        long st = System.currentTimeMillis();

        CompletableFuture<String> a = CompletableFuture.supplyAsync(()-> {
            var a1 = he();
            var a2 = spa();
            var a3 = wo();
            return a1+a2+a3;
        });

        System.out.println(a.join());

        System.out.println("total time = " + (System.currentTimeMillis() - st));
    }

    @Test
    public void oneThreadRun() throws InterruptedException {
        CompletableFuture.runAsync(()-> {
            var a1 = he();
            var a2 = spa();
            var a3 = wo();

            System.out.println(a1+a2+a3);
        });

        Thread.sleep(4500);
        System.out.println("finish");
    }

    public String he(){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){

        }
        return "Hello";
    }

    public String spa(){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){

        }
        return " - ";
    }

    public String wo(){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){

        }
        return "World";
    }
}
