package com.annotationdemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Book {
    //书名
    String bookName();
    //价格
    double price() default 100;
    //多位作者
    String[] authors();
}
