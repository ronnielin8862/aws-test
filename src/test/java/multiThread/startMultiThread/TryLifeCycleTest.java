package multiThread.startMultiThread;

import org.junit.Test;

public class TryLifeCycleTest {

    @Test
    public void testLifeCycle(){
        TryLifeCycle t = new TryLifeCycle();

        t.tyrMain();

        System.out.println("finish" + Thread.currentThread());
    }
}
