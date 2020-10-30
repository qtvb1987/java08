package list.demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo01 {
    public static void main(String[] args) {
        Map<String,Integer> map=new LinkedHashMap<>();
        map.put("aaa",111);
        map.put("bbb",222);
        System.out.println(map);

    }
}
