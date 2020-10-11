package com.pvmdemo;

public class TestPcm {
    public static void main(String[] args) {
        //创建存储
        Store store=new Store();
        //创建生产者线程
        while (true) {
            Thread t1 = new Thread(new ProductorTask(store));

            //创建消费者线程
            Thread t2 = new Thread(new CustomerTask(store));

            //启动生产者线程
            t1.start();
            //启动消息者线程
            t2.start();
        }
    }
}
