package multiThread.mainThread.service;

import org.springframework.stereotype.Service;

@Service
public class Servi {

    public void printService(){
        System.out.println("enter service");

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){}

        System.out.println("service finish");
    }
}
