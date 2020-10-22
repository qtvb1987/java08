package mx.mianxiang1020;

public class YaMaHa extends Motor {
    @Override
    public void run() {
        YaMaHa motor=new YaMaHa();
        motor.setBrand("雅马哈");
        motor.setPrice(50000);
        System.out.println("价值"+motor.getPrice()+"元的"+motor.getBrand()+"摩托车正在运行");

    }
}
