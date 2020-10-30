package list.demo;

import java.util.HashMap;

public class TestDemo05 {
    public static void main(String[] args) {
        String str="fjekwFDQFjfeAFEajfeo2FAFEjfew";
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(hashMap.containsKey(c)){
                int co=hashMap.get(c);
                hashMap.put(c,++co);
            }else {
                hashMap.put(c,1);
            }
        }
        System.out.println(hashMap);

    }
}
