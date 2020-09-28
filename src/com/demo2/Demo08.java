package com.demo2;

/**
 * 练习
 */
public class Demo08 {
    public static void main(String[] args) {
        int tigerWeight=188;
        int tigerWeight2=200;
        System.out.println(188==200?true:false);

        int height1=50;
        int height2=66;
        int height3=45;
        int height5=height1>height2?height1:height2;
        int height6=height5>height3?height5:height3;
        System.out.println(height6);

    }
}
