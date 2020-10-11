package com.pvmdemo02;

/**
 * 生产者线程  不要在run 中死循环 消耗性能run要跑飞
 */
public class ProductorTask implements Runnable {
    private Store store;
    public ProductorTask(Store store) {
        this.store=store;
    }

    @Override
    public void run() {
//        while (true){
//
//        }
        //模拟0-100随机数的产生
        int n=(int)(Math.random()*100);
        //将随机数放入队列中
        store.push(n);

    }
}
