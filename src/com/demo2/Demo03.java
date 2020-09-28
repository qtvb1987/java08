package com.demo2;

/**
 * 赋值运算符
 */
public class Demo03 {
    public static void main(String[] args) {
        //= += *= /= %=
        int a=100;
        int b=20;
        a+=b;
        System.out.println("a="+a);
        a-=b;
        System.out.println("a="+a);
        a*=b;
        System.out.println("a="+a);
        a/=b;
        System.out.println("a="+a);
        a%=b;
        System.out.println("a="+a);

        short s1=1;
        s1+=1;//运算过程中带强转 =(short) (s1+1);
        s1=(short) (s1+1);//强转
    }
}
