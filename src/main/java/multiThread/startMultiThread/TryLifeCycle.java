package multiThread.startMultiThread;

import java.util.concurrent.CompletableFuture;

// 這個驗證出Java多執行緒的特性，會等子線程結束
// 但為何用test卻不會繼續執行子線程
public class TryLifeCycle {

    public static void main(String[] args) {

        CompletableFuture.runAsync(()->{
            int i;
            for (i= 0; i<10; i++){
                System.out.println(i);
            }
            System.out.println("sub thread finished");
        });

        System.out.println("main thread finished");
    }

    public void tyrMain(){
        System.out.println("main start");

        CompletableFuture.runAsync(()->{
            int i;
            for (i= 0; i<10; i++){
                System.out.println(i);
            }
        System.out.println("main thread finished");
        });

        System.out.println("main finish");
    }
}
