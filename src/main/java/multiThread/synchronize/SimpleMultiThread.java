package multiThread.synchronize;

class AdditionClass{
    private int count = 0;
    protected synchronized void add() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " 加了1, 變成了 " + count++);
        Thread.sleep(70);
    }
}

class Subtraction{
    private int point = 100;
    protected synchronized void subtraction() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "減了1, 變成了 " + point--);
        Thread.sleep(300);
    }
}

public class SimpleMultiThread {
    public static void main(String[] args) {

        AdditionClass additionClass = new AdditionClass();
        Subtraction subtraction = new Subtraction();

        new Thread(() -> {
            int i = 1;
            do {
                try {
//                    additionClass.add();
                    subtraction.subtraction();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
            }while(i <= 10);
        },"AA").start();

        new Thread(()->{
            int z = 1;
            do{
                try {
                    subtraction.subtraction();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                z++;
            }while (z<=20);
        },"BB").start();

        new Thread(()->{
            int z = 1;
            do{
                try {
                    subtraction.subtraction();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                z++;
            }while (z<=20);
        },"CC").start();
    }
}