package list.demo;

import java.util.LinkedList;

public class LinkedListDemo01 {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addFirst("dddd");
        list.add("aaa");
        //list.poll();
        list.push("ddd");
        System.out.println(list);
    }
}
