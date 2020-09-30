package com.demo03;

/**
 * 分支语句 第一种格式 If(条件){执行语句}
 */
public class IfDemo01 {
    public static void main(String[] args) {
        //定义 两个变量 a b
        int a=10;
        int b=20;

        //单一判断  a>b
        if(a>b){
            System.out.println("a大于b");
        }

        if(a==b){
            System.out.println("a等于b");
        }
        System.out.println("结束");

    }
}
