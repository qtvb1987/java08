package mx.mianxiang1020;

public  class BenCar extends Car {

    @Override
    public void run() {
        BenCar car=new BenCar();
        car.setBrand("奔驰");
        car.setPrice(500000);
        System.out.println("价值"+car.getPrice()+"元的"+car.getBrand()+"车正在运行");
    }
}
