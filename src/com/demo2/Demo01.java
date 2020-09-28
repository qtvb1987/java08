package com.demo2;

/**
 * 基本数据类型转换
 */
public class Demo01 {
    public static void main(String[] args) {
        //byte short int long float double char boolean
        //1.自动类型转换：小范围类型转换成大范围类型
        int i=100;
        byte b=90;
        //byte b2=i+b;//int 类型和byte发生运算时候(加法运算) 其结果是int类型
        int j=i+b;
        System.out.println(j);

        short s=20;
        int m=999;
        int x=m+s;
        System.out.println(x);

        //2 强制类型转换：大范围类型强制转换成小范围类型
        //语法 ： 数据类型 变量名=(转换类型)数据;
        //1.5 赋值int 变量
        int i2=(int)1.5;
        System.out.println(i2);

        long l=100l;
        int i3=(int)l;

        short s2=1;
        s2=(short)(s2+1);
        System.out.println(s2);

        //ASCII编码表
        //字符类型变量
        char c='a';
        int i10=1;
        //字符类型和int类型计算
        System.out.println(c+i10);

    }
}
