package multiThread.mainThread.Controller;

import multiThread.mainThread.service.Servi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;


// 透過這個例子可以看到，由於服務一直活著的關係，主線程結束以後，子線程(service的 print finish)也會繼續運作
// 但是在公司練習的範例，單純使用Test啟動，主線程結束以後子線程也就結束了
// 這實驗證實了公司代碼 "在api被觸發以後，透過子線程處理後續業務，讓主線程先返回給客戶端" ，這樣的運作是沒問題的。
// 後續自己的程式設計上也可以安心的照此應用了
@RestController
@RequestMapping("/thread")
public class MainCon {

    @Autowired
    Servi servi;

    @RequestMapping(method = RequestMethod.POST,value = "/test1")
    public void mainThread1(){
        System.out.println("Start");

        CompletableFuture.runAsync(()-> servi.printService());

    }
}
