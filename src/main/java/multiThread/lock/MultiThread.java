package multiThread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SaveData{
    int count = 0;
    private Lock lock = new ReentrantLock();

    void addition(String AA){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "execute addition , count = " + count++);
            System.out.println(AA);
        }finally {
            lock.unlock();
        }
    }
}

public class MultiThread {
    public static void main(String[] args) {
        SaveData saveData = new SaveData();

        new Thread(()->{
            for (int i =0; i<= 10; i++){
                saveData.addition("test1 + " + i);
            }
        },"AA").start();

        new Thread(()->{
            for (int i =0; i<= 10; i++){
                saveData.addition("test2 + "+i);
            }
        },"BB").start();


        Thread CC = new Thread(()->{
            for (int i =0; i<= 13; i++){
                System.out.println("哦哦哦哦  - " +i);
            }
        },"BB");


        CC.setPriority(3);
        CC.start();
    }
}
