package com.pvmdemo02;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 存储-队列实现 可重入锁
 */
public class Store {
    //创建队列
    LinkedList<Integer> list=new LinkedList<Integer>();

    //创建可重入锁
    Lock lock=new ReentrantLock();
    //对象监视器
    Condition condition=lock.newCondition();
    //设置最大值
    int max=10;
    //放入队尾
    public void push(int n){
        try {
            //获得锁
            lock.lock();
            //队列满了
            if (list.size() >= max) {
                System.out.println("队列满了...");
                //线程挂起
                condition.await();
            }
            else {
                //队列不满，可以放入
                System.out.println("放入："+n);
                list.add(n);
                //唤醒取的线程(在list上等的线程) 信号量
                condition.signalAll();
            }


        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            //释放锁
            lock.unlock();
        }
    }
    //从队头取出
    public int pop(){
        try{

            lock.lock();
            if(list.size()<=0){
                System.out.println("队列空了");
                //线程挂起
                condition.await();
            }
            else {
               //队列不空，可取出(可能满)
                int n= list.poll();
                System.out.println("取出："+n);
                condition.signalAll();
                return n;
            }


        }
        catch (Exception e){
            e.printStackTrace();

        }
        finally {
            lock.unlock();
        }
        return 0;
    }
}
