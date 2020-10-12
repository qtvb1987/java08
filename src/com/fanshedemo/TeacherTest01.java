package com.fanshedemo;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class TeacherTest01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //第一步先要加载配置文件
        //加载外部文件 借助与类加载器
        ClassLoader cl=TeacherTest01.class.getClassLoader();
        InputStream is= cl.getResourceAsStream("pro.properties");

        //通过集合获取键对应值
        Properties p1=new Properties();
        p1.load(is);
        //通过键获取值
        String classname= p1.getProperty("className");
        String methodname= p1.getProperty("methodName");

        Class c1=Class.forName(classname);
        Object ob=c1.newInstance();
        Method m1=c1.getMethod(methodname);
        m1.invoke(ob);
    }
}
