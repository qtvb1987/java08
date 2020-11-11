package iodemo;

import java.io.*;

public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("E:\\aaa.png"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("E:\\aa\\aaa.png"));
        byte[] bytes=new byte[1024];
        int len;
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        System.out.println("复制完成");
        bis.close();
        bos.close();
    }
}
