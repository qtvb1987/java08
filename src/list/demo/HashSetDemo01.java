package list.demo;

import java.util.HashSet;

public class HashSetDemo01 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("cba");

        set.add("abc");

        set.add("bac");

        set.add("cba");

        for (int i = 0; i < set.size(); i++) {

            // System.out.println(set.get(i));

        }

    }

}
