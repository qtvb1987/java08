package pcmdemo;

public class CustomerTask implements Runnable{
    private Store store;
    public  CustomerTask(Store store){
        this.store=store;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            int n = store.pop();
            System.out.println("消费" + n);


    }
}
