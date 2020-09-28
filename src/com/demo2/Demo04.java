package com.demo2;

/**
 * 自增自减运算符
 */
public class Demo04 {
    public static void main(String[] args) {
        //++ 在变量值的基础上加1
        int a=100;
        a++;
        System.out.println("a="+a);

        //a++ ++在变量名后  其他操作输出 先执行其他操作 其他操作执行完毕后自加1
        System.out.println(a++);
        System.out.println(a);//等输出语句完毕后 a自加1
        //2.++ 在变量名前 ++b

        int b=200;
        ++b;
        System.out.println("b="+b);
        //++ 在前 先自加1 在执行其他操作
        System.out.println(++b);

        //-- 在变量值的基础上减1
    }

}
