package mx.mianxiang1022;

public class Test03 {
    public static void main(String[] args) {
        new Inter02(){

            @Override
            public void print() {
                System.out.println("你好匿名内部类");
            }
        }.print();
    }
    public static void print(){
        System.out.println("print");
    }
}
