package mx.mianxiang1020;

public class BaoCar2 extends Car2 implements GPS {
    @Override
    public void gps() {

        //价值800000元的宝马车已经开启GPS定位
        System.out.println("价值"+getPrice()+"元的"+getBrand()+"车已经开启GPS定位");
    }

    @Override
    public void run() {
        //价值800000元的宝马车正在运行
        System.out.println("价值"+getPrice()+"元的"+getBrand()+"车正在运行");
    }
}
