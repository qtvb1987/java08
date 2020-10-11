package com.pooldemo;

public class TicketTask001  implements  Runnable{
    //默认10张票
    private int ticket=10;
    @Override
    public void run() {
        for (int i=0;i<=15;i++){
            if(ticket>0){
                //获得当前执行线程名
                System.out.println(Thread.currentThread().getName()+"买票，剩余"+ticket--);
            }
            else {
                System.out.println(Thread.currentThread().getName()+"票卖完了");
                break;
            }
        }
    }
}
