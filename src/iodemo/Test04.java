package iodemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test04 {
    public static void main (String[] args) throws IOException{

     write();

      read();

     }

    public static void write() throws IOException {

      FileWriter fw = new FileWriter("d:\\fw.txt");

      fw.write( "hello" );
      fw.flush();
      fw.close();

    }

   public static void read() throws IOException {

       FileReader fr = new FileReader("d:\\fw.txt");

       int ch = -1;

       while ((ch = fr.read()) != -1) {

           System.out.print((char) ch);

       }
       fr.close();
   }
}
