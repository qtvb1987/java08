package com.demo03;

/**
 * For 求1-100偶数和
 */
public class ForTest02 {
    public static void main(String[] args) {
        int num=0;
        for (int i=1;i<=100;i++){
            if(i%2==0){
                num+=i;

            }
        }
        System.out.println(num);
    }
}
