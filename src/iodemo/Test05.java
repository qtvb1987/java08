package iodemo;

import java.io.*;

public class Test05 {
    public static void main (String[] args) throws IOException{

      write();

      read();

     }

    public static void write() throws IOException {

       BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\bw.txt") );

       bw.write("hello");

       bw.newLine();

      bw.flush();

      bw.close();

    }

     public static void read() throws IOException {

       BufferedReader br = new BufferedReader(new FileReader("d:\\bw.txt") );

      String line = null;

      while ((line = br.readLine()) != null) {

         System.out.print( line );

      }

      br.close();

      }
}
