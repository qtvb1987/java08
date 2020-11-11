package iodemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Test02 {
    public static void main(String[] args) throws IOException {
        LinkedHashMap<Integer,String> linkedList=new LinkedHashMap<>();
        FileInputStream fis = new FileInputStream("E:\\tangshi.txt");
        FileOutputStream fos = new FileOutputStream("E:\\tangshinew3.txt");
        int len=0;
        byte[] bytes=new byte[1024];
        while ((len=fis.read(bytes))!=-1){
            String content=new String(bytes);
            String[] strings=content.split("\r\n");
            for (int i=0;i<strings.length;i++){
                String s1=new StringBuffer(strings[i]).reverse().toString();
                if(s1.contains("床")){
                    linkedList.put(1,s1);
                }
                if(s1.contains("疑")){
                    linkedList.put(2,s1);
                }
                if(s1.contains("举")){
                    linkedList.put(3,s1);
                }
                if(s1.contains("低")){
                    linkedList.put(4,s1);
                }
               // byte[] b2=new StringBuffer(strings[i]).toString().getBytes();
            }

            System.out.println(new String(bytes));
        }
        System.out.println(linkedList);
        for (int y=1;y<5;y++){
            String s2=linkedList.get(y).trim()+"\n";
            System.out.println(s2);
            byte[] b2=s2.getBytes();
            fos.write(b2);

        }
        fis.close();
        fos.close();
    }
}
