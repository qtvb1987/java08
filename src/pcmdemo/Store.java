package pcmdemo;

import java.util.LinkedList;

/**
 * 存储-队列实现
 */
public class Store {
    //创建队列
    LinkedList<Integer> list=new LinkedList<>();
    //最大值
    int max=10;
    //放入队尾
    public void push(int n){
        try {
            //同步队列
            synchronized (list) {
                //队列满了
                if (list.size() >= max) {
                    System.out.println("队列满了");
                    list.wait();
                }
                //队列不满，放入(有可能空)
                else {
                    System.out.println("放入"+n);
                    list.add(n);
                    //唤醒取的线程(在list上等的线程)
                    list.notifyAll();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    //从队头取出
    public int pop(){
        try {
            //同步队列
            synchronized (list) {
                //队列空
                if (list.size() <= 0) {
                    System.out.println("队列空了.");
                    list.wait();
                } else {
                    //队列不空，可取出(可能满)
                    int n= list.poll();
                    System.out.println("取出"+n);
                    list.notifyAll();
                    return n;
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

        return 0;
    }
}
