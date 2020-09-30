package com.demo03;

import java.util.Scanner;

/**
 * 练习
 * 需求 任意给出一个整 数 ，请用程序实现判断该整数是奇数还是偶数，并输出
 */
public class IfTest01 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num=s1.nextInt();
        if(num%2==0){
            System.out.println(num+"偶数");
        }else {
            System.out.println(num+"奇数");
        }
    }
}
