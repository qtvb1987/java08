package mx.mianxiang;

public class class01 {
    //属性
    String name;
    int age;

    //行为
    public void study(){
        System.out.println("学习");
    }
    public void eat(){
        System.out.println("在吃");
    }

    public static void main(String[] args) {
        //创建对象
        class01 xiaoming=new class01();
        System.out.println(xiaoming);
        xiaoming.name="xiaoming";
        System.out.println(xiaoming.name);
    }
}
