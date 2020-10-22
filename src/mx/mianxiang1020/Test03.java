package mx.mianxiang1020;

public class Test03 {

    public static void main(String[] args) {
        BenCar2 benCar2=new BenCar2();
        benCar2.setBrand("奔驰");
        benCar2.setPrice(500000);
        benCar2.run();
        BaoCar2 baoCar2=new BaoCar2();
        baoCar2.setBrand("宝马");
        baoCar2.setPrice(800000);
        baoCar2.run();
        baoCar2.gps();
        YaMaHa2 yaMaHa2=new YaMaHa2();
        yaMaHa2.setBrand("雅马哈");
        yaMaHa2.setPrice(50000);
        yaMaHa2.run();
        BaoMotor2 baoMotor2=new BaoMotor2();
        baoMotor2.setBrand("宝马");
        baoMotor2.setPrice(80000);
        baoMotor2.run();
        baoMotor2.gps();
    }
}
