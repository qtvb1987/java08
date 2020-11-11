package pcmdemo;

public class RunPcm {
    public static void main(String[] args) {
        //创建存储
        Store store=new Store();
        while (true) {
            Thread t1 = new Thread(new ProductorTask(store));
            Thread t2 = new Thread(new CustomerTask(store));
            //启动生产
            t1.start();
            //启动消费
            t2.start();
        }
    }
}
