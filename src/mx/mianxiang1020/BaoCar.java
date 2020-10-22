package mx.mianxiang1020;

public class BaoCar extends Car implements GPS {
    @Override
    public void run() {
        BaoCar car=new BaoCar();
        car.setBrand("宝马");
        car.setPrice(800000);
        System.out.println("价值"+car.getPrice()+"元的"+car.getBrand()+"车正在运行");

    }

    @Override
    public void gps() {
        BaoCar car=new BaoCar();
        car.setBrand("宝马");
        car.setPrice(800000);
        System.out.println("价值"+car.getPrice()+"元的"+car.getBrand()+"已经开启GPS定位");

    }
}
