package com.fanshedemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class FanSheTest01 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        //第一种方式 得到Class文件对象
        Student student=new Student(11,"zhansan");
        Class c1=student.getClass();
        System.out.println(c1);

         //第二种方式
        Class c2=Student.class;
        System.out.println(c2);

        //第三种方式
        Class c3=Class.forName("com.fanshedemo.Student");
        System.out.println(c3);

      //  method01();
      //  method02();
        method03();

    }
    //获取构造方法
    public static  void method01() throws IllegalAccessException, InvocationTargetException, InstantiationException {
        //使用反射得到类中方法 第一步都是先得到class对象
        Class c2= Student.class;
        //调用构造器方法 得到构造器对象
        Constructor[] cr= c2.getConstructors();
        for (Constructor cr01:cr) {
            System.out.println(cr01);

        }

        cr[0].newInstance();
        cr[1].newInstance(44,"zhangsan");
    }

    //获取单一构造方法
    public static void method02() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class c1=Class.forName("com.fanshedemo.Student");
        //获取构造器对象，指定参数类型
        Constructor cc=c1.getConstructor(int.class,String.class);
        //调用构造方法
        Object oo=  cc.newInstance(44,"zhangsan");
        System.out.println(oo);
    }
    //class类中有获取无参构造方法
    public static void method03() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c1=Class.forName("com.fanshedemo.Student");
        //只能调用无参构造 必需是public
        Object oo= c1.newInstance();
        System.out.println(oo);
    }
}
