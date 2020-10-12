package com.fanshedemo;

public class FanSheTest01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //第一种方式 得到Class文件对象
        Student student=new Student(11,"zhansan");
        Class c1=student.getClass();
        System.out.println(c1);

         //第二种方式
        Class c2=Student.class;
        System.out.println(c2);

        //第三种方式
        Class c3=Class.forName("com.fanshedemo.FanSheTest01");
        System.out.println(c3);

    }
}
