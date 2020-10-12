package com.fanshedemo;

import sun.net.spi.nameservice.dns.DNSNameService;

public class FanSheDemo01 {
    public static void main(String[] args) {

        //method01();
        method02();
        //method03();
    }
    //引导类加载器案例
    public static void method01(){
        ClassLoader cl=String.class.getClassLoader();
        System.out.println(cl);
    }

    //扩展类加载器
    public static void method02(){
        ClassLoader cl= DNSNameService.class.getClassLoader();
        System.out.println(cl);
        System.out.println(cl.getParent());
       // System.out.println(cl.getParent().getParent());
    }

    //应用类加载器
    public static void method03(){
        //ClassLoader cl= Test.class.getClassLoader();
        ClassLoader cl= FanSheDemo01.class.getClassLoader();
        System.out.println(cl);
        System.out.println(cl.getParent());
        System.out.println(cl.getParent().getParent());
    }
}
