package multiThread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SaveData{
    int count = 0;
    private Lock lock = new ReentrantLock();

    void addition(){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "execute addition , count = " + count++);
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
                saveData.addition();
            }
        },"AA").start();

        new Thread(()->{
            for (int i =0; i<= 10; i++){
                saveData.addition();
            }
        },"BB").start();
    }
}
