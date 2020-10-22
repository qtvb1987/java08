package mx.mianxiang1022;

public class Outer {
    public int age=10;
    private String name="111";
    class Inner{
        public String sex="男";
        public void show(){
            System.out.println(name);
            System.out.println(age);
        }
    }
    public void sleep(){
        Inner inner=new Inner();
        System.out.println(inner.sex);
    }
}
