package com.fanshedemo;

public class Student {
    private int age;
    private String Name;

    public Student() {
        System.out.println("无参构造方法");
    }
    public Student(int age, String name) {
        System.out.println("有参构造方法");
        this.age = age;
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public static void Method01(){
        System.out.println("student");
    }
}
