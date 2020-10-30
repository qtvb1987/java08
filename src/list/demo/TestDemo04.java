package list.demo;

import java.util.HashSet;

public class TestDemo04 {
    public static void main(String[] args) {
        HashSet<Student> hashSet=new HashSet<>();
        hashSet.add(new Student("张三",20,"男"));
        hashSet.add(new Student("李四",14,"女"));
        hashSet.add(new Student("张三",20,"男"));

        for (Student s:hashSet
             ) {
            System.out.println(s);

        }
    }
}
