package com.demo;

/**
 * 变量的使用
 */
public class Demo03 {
    public static void main(String[] args) {
        //在书写语句的过程中每条语句后面必须要加分号 代表语句结束
        //声明并赋值 整数（byte short int long）类型变量
        byte num01=10;

        short num02=200;
        int num03=9000;
        //long 类型数据后面加l/L
        //在赋值long类型变量的时候 不加l他其实类型是int 因为long范围比int大进行自动转换
        long num04=900000;
        //先声明再赋值
        int num05;//声明了一个变量名为num05类型变量
        num05=400;//给num05变量进行赋值

        //小数 float 变量声明小数后面加f/F
        float num06=55.4f;

        double num07=99.99;

        //字符型 存储单个字符(一个字母 一个汉字 或者一个标点符号)
        char sex='男';

        //布尔类型
        boolean flag=true;

        //变量在使用之前必须赋值
        int m=0;
        System.out.println(m);


    }
}
