package com.demo03;

import java.util.Scanner;

/**
 * 根据输入的数字，输出对应的星期几
 */
public class IfTest03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入一个数字");
        int a=scanner.nextInt();
        if(a==1){
            System.out.println("星期一");
        }else if(a==2){
            System.out.println("星期二");
        }
    }
}
