package com.demo03;

/**
 * if（关系表达式）
 * {
 *
 * }
 * else if(关系表达式)
 * {
 *
 * }
 * else if(关系表达式)
 * {
 *
 * }
 */
public class IfDemo03 {
    public static void main(String[] args) {
        //小明成绩  大于85 优 60-85 及格  小于60 不及格
        double grade=88.6;
        if(grade>85){
            System.out.println("优");
        }
        else if(grade>=60){
            System.out.println("及格");
        }
        else {
            System.out.println("不及格");
        }
    }
}
