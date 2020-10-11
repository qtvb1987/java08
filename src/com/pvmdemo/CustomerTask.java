package com.pvmdemo;

public class CustomerTask implements Runnable {
    private  Store store;
    public CustomerTask(Store store) {
        this.store=store;
    }

    @Override
    public void run() {
       int n=  store.pop();
        System.out.println("消费"+n);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
