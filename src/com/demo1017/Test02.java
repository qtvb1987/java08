package com.demo1017;

public class Test02 {
    public static void main(String[] args) {
        NewPhone phone=new NewPhone();
        phone.setName("HuaWei");
        phone.setPrice(1888.68);
        System.out.println(phone.name);
        System.out.println(phone.price);
        phone.play();
        phone.send();
        phone.message();
    }
}
