package com.demo1017;

public class OldPhone {
    //品牌
    String name;
    //价格
    double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void play(){
        System.out.println("打电话");
    }
    public void send(){
        System.out.println("发短信");
    }
    public void message(){
        System.out.println("来电显示");
    }
}
