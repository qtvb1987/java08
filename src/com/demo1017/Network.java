package com.demo1017;

public class Network  extends Manage{
    @Override
    public void work() {
        System.out.println("员工号为"+getId()+"的"+getName()+"员工，正在维护网络");
    }
}
