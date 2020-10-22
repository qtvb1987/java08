package mx.mianxiang1020;

public class BaoMotor extends Motor implements GPS{
    @Override
    public void gps() {
        BaoMotor motor=new BaoMotor();
        motor.setBrand("宝马");
        motor.setPrice(80000);
        System.out.println("价值"+motor.getPrice()+"元的"+motor.getBrand()+"摩托车已经开启GPS定位");

    }

    @Override
    public void run() {
        BaoMotor motor=new BaoMotor();
        motor.setBrand("宝马");
        motor.setPrice(80000);
        System.out.println("价值"+motor.getPrice()+"元的"+motor.getBrand()+"摩托车正在运行");

    }
}
