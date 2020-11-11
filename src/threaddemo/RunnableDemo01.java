package threaddemo;

public class RunnableDemo01 implements Runnable {

   public static void main (String[] args) {

      Thread t = new Thread(new RunnableDemo01() );

      t.start();

    }

    public void run(int num) {

      for (int i =0; i < num; i++) {

        System.out.println( i );

       }

    }


    @Override
    public void run() {
        for (int i =0; i < 10; i++) {

            System.out.println( i );

        }
    }
}
