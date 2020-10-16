package com.bigdecimaldemo;

import java.math.BigDecimal;

public class BigDecimalTest01 {
    public static void main(String[] args) {
        BigDecimal b1=new BigDecimal("1");
        BigDecimal b2=new BigDecimal("3");
        BigDecimal b3=b1.divide(b2,3,BigDecimal.ROUND_HALF_UP);
        BigDecimal b4=b1.divide(b2,5);
        BigDecimal b5=b1.divide(b2,5,BigDecimal.ROUND_DOWN);
        BigDecimal b6=b1.divide(b2,5,BigDecimal.ROUND_UP);
        //四舍五入
        System.out.println("ROUND_HALF_UP"+b3);
        //直接舍去
        System.out.println("ROUND_DOWN"+b5);
        //向上加1
        System.out.println("ROUND_UP"+b6);
    }
}
