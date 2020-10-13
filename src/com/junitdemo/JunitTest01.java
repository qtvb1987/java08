package com.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 单元测试 单个方法执行 @Test  ,必需public void  无参数列表 ，无返回值
 */
public class JunitTest01 {
    @Test
    public  void testMethod01(){
        System.out.println("test");
    }

    @Before
    public  void testMethod03(){
        System.out.println("before");
    }

    @After
    public  void testMethod04(){
        System.out.println("after");
    }


    @Test
    public  void testMethod02(){
        System.out.println(1/0);
        System.out.println("test");
    }
}
