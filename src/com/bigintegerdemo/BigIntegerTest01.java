package com.bigintegerdemo;

import java.math.BigInteger;

public class BigIntegerTest01 {
    public static void main(String[] args) {
        BigInteger b1=new BigInteger("111111111");
        BigInteger b2=new BigInteger("333333333");
        BigInteger b3=b1.add(b2);

        BigInteger b4=b1.subtract(b2);
        BigInteger b5=b1.divide(b2);
        BigInteger b6=b1.multiply(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b6);
        System.out.println(b5);
    }
}
