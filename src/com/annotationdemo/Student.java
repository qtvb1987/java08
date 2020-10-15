package com.annotationdemo;

/**
 * 注解
 */

public @interface Student {
    //姓名
    String name();
    //年龄
    int age();
    //性别
    String sex();
}
