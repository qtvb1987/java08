package mx.mianxiang1022;

public class InnerTest01 {
    public static void main(String[] args) {
        Outer.Inner inner=new Outer().new Inner();
        inner.show();

        Outer outer=new Outer();
        outer.sleep();
    }
}
