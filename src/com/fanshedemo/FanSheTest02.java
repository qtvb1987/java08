package com.fanshedemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射得到方法
 */
public class FanSheTest02 {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        //method01();
        method02();
    }
    //得到Student类中所有public修饰方法 包括父类中方法
    public static void method01() throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Class c1=Student.class;
        Object o1=c1.newInstance();
        Method[] m1=c1.getMethods();
        for (Method m:m1
             ) {
            System.out.println(m);

        }
        //调用成员方法 需要传入一个对象进去
        System.out.println(m1[0].invoke(o1));
    }

    public static void method02() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class c1=Student.class;
        Object o1=c1.newInstance();
        Method m1=c1.getMethod("getName");
        m1.invoke(o1);

        Method m2=c1.getMethod("setName", String.class);
        m2.invoke(o1,"lishi");
    }
}
