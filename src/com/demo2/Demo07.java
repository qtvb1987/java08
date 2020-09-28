package com.demo2;

/**
 * 三元运算符
 */
public class Demo07 {
    public static void main(String[] args) {
        //数据类型 变量名=z?x:y
        //z布尔类型表达式
        //x数据
        //y数据
        //入门案例 z部分表达式 结果为true的 整个表达式输出的结果为1 否则为2
        System.out.println(true?1:2);
        System.out.println(false?1:2);
        int i1=true?1:2;
        System.out.println(i1);
        System.out.println(true?1.1:2);


    }
}
