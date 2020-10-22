package mx.mianxiang1020;

public class BaoMotor2 extends Motor implements GPS{
    @Override
    public void gps() {

        System.out.println("价值"+getPrice()+"元的"+getBrand()+"摩托车已经开启GPS定位");

    }

    @Override
    public void run() {

        System.out.println("价值"+getPrice()+"元的"+getBrand()+"摩托车正在运行");

    }
}
