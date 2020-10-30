package list.demo;

import java.util.HashMap;
import java.util.HashSet;

public class TestDemo03 {
    public static void main(String[] args) {
        HashSet<User> set = new HashSet<User>();

        set.add(new User("杰克", 18));

        set.add(new User("肉丝", 17));

        set.add(new User("杰克", 19));

        set.add(new User("肉丝", 16));

        System.out.println(set);
        int sum=0;

        for (User u : set) {

           sum+=u.getAge();

        }

        System.out.println(sum/set.size());

        HashMap<String, Integer> map = new HashMap<>();

        map.put("张三", 18);

        map.put("李四", 20);

        map.put("张三", 20);

        System.out.println(map.get("张三"));
    }
}
