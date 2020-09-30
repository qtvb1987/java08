package com.demo03;

public class ForTest06 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
