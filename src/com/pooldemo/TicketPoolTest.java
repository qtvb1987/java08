package com.pooldemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TicketPoolTest {
    public static void main(String[] args) {
        //利用线程池创建线程

        //创建放5个线程的线程池
       // ExecutorService service= Executors.newFixedThreadPool(5);
        //可缓存的
        ExecutorService service=Executors.newCachedThreadPool();
        for (int i=1;i<=5;i++){
            //执行线程
            service.execute(new TicketTask001());
        }
        //关闭线程池
        service.shutdown();
    }
}
