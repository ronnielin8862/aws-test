package testing;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@ComponentScan
@Service
public class TestClass {

    public void init() {
        System.out.println("init 執行了");
    }

    public void print(){
        System.out.println("print 執行了");
    }

    public String GetStringA(String cc){
        return cc;
    }

    public void TestClass(){
        System.out.println("建構子執行了");
    }
}
