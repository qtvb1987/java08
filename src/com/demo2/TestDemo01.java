package com.demo2;

public class TestDemo01 {
    public static void main(String[] args) {
        int a=1234;
        System.out.println("千位是"+a/1000);
        System.out.println("百位是"+(a/100)%10);
        System.out.println("十位"+(a/10)%10);
        System.out.println("个位"+a%10);

        int s1= sum(1,2);
        System.out.println(s1);
        int s2= sum(1,2,3);
        System.out.println(s2);
        double d1= sum(1.1,1.2);
        System.out.println(d1);
    }

    //两个整数相加
    public static  int sum(int a,int b){
        int c=a+b;
        return c;
    }

    //三个整数相加
    public static  int sum(int a,int b,int c){
        int d=a+b+c;
        return d;
    }

    //两个小数相加
    public static  double sum(double a,double b){
        double c=a+b;
        return c;
    }
}

