package list.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("刘备");
        set.add("关羽");
        set.add("张飞");
        set.add("刘备");
        set.add("张飞");
        System.out.println(set);
        System.out.println("-------迭代器-----");
        Iterator<String> iterator= set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("---增强for-----");
        for (String s:set
             ) {
            System.out.println(s);

        }
    }
}
