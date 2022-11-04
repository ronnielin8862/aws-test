package multiThread.lock;

import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SaveData{
    int count = 0;
    private Lock lock = new ReentrantLock();

    void addition(String AA) throws InterruptedException {

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
    public static void main(String[] args) throws InterruptedException {
        SaveData saveData = new SaveData();

        new Thread(()->{
            for (int i =0; i<= 10; i++){
                try {
                    saveData.addition("test1 + " + i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"AA").start();

        new Thread(()->{
            for (int i =0; i<= 10; i++){
                try {
                    saveData.addition("test2 + "+i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"BB").start();


        Thread CC = new Thread(()->{
            for (int i =0; i<= 13; i++){
                System.out.println("哦哦哦哦  - " +i);
            }
        },"BB");


        CC.setPriority(3);
        CC.start();


        // 以下是呈現，Object 物件都可以使用線程等待與喚醒相關方法
        Object J = new Object();
        J.wait();
        String AAA = new String();
        AAA.notify();
    }
}
