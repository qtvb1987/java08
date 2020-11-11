package pcmdemo;

/**
 * 生产者线程
 */
public class ProductorTask implements Runnable {
    private Store store;
    public  ProductorTask(Store store){
        this.store=store;
    }
    //不在run中死循环，消耗性能
    @Override
    public void run() {

            //模拟0-100随机数的产生
            int n = (int) (Math.random() * 100);
            //将随机数放入队列中
            store.push(n);

    }
}
