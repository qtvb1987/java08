package com.testdemo1013;

/**
 * 交通工具类
 */
public class Vehicle {
    //成员变量
    //品牌
     String brand;
    //类型
     String type;
     //成员方法
    //启动方法
    public  void start(){
        System.out.println(brand+"开始启动");
    }
    //行驶方法
    public  void run(){
        System.out.println(brand+"在高速公路上行驶");
    }
}
