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
