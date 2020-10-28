package list.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection collection=new ArrayList();
        collection.add("JavaEE企业级开发指南");
        collection.add("Oracle高级编程");
        collection.add("MySQL从入门到精通");
        collection.add("Java架构师之路");
        Iterator is= collection.iterator();
        while (is.hasNext()){
            System.out.println(is.next());

        }

        Collection collection2=new ArrayList();
        collection2.add("JavaEE企业级开发指南");
        collection2.add("Oracle高级编程");
        collection2.add("MySQL从入门到精通");
        collection2.add("Java架构师之路");
        Iterator is2= collection2.iterator();
        while (is2.hasNext()){
            String v=(String) is2.next();
            if(v.length()<10){
                System.out.println("书名长度小于10="+v);
            }
        }

        Collection collection3=new ArrayList();
        collection3.add("JavaEE企业级开发指南");
        collection3.add("Oracle高级编程");
        collection3.add("MySQL从入门到精通");
        collection3.add("Java架构师之路");
        Iterator is3= collection3.iterator();
        while (is3.hasNext()){
            String v=(String) is3.next();
            if(v.contains("Java")){
                System.out.println("书名包含Java="+v);
            }
        }

        Collection collection4=new ArrayList();
        collection4.add("JavaEE企业级开发指南");
        collection4.add("Oracle高级编程");
        collection4.add("MySQL从入门到精通");
        collection4.add("Java架构师之路");
        Object[] objects=collection4.toArray();
        for (int i=0;i< objects.length;i++) {
             String s=(String) objects[i];
             if(s.contains("Oracle")){
                 collection4.remove(s);
             }

        }
        Iterator is4= collection4.iterator();
        while (is4.hasNext()){
            System.out.println(is4.next());
        }
    }
}
