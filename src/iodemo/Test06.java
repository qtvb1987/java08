package iodemo;

import java.io.*;

public class Test06 {
    public static void main(String[] args) throws IOException {

       write();

      write();

      read();

   }



    public static void write() throws FileNotFoundException {

      PrintWriter pw = new PrintWriter(new FileOutputStream("d:\\file.txt", true));

      pw.println("你好");

      pw.close();

     }



     public static void read() throws IOException {

      BufferedReader br = new BufferedReader(new FileReader("d:\\file.txt"));

      String line = null;

      while ((line = br.readLine()) != null) {

         System.out.println(line);

       }

       br.close();

    }
}
