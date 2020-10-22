package mx.mianxiang1020;

public class BenCar2  extends  Car {
    @Override
    public void run() {
        //价值500000元的奔驰车正在运行
        System.out.println("价值"+getPrice()+"元的"+getBrand()+"车正在运行");
    }
}
