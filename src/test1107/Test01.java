package test1107;

public class Test01 {
    public static void main(String[] args) {
        Class c = String.class;
        System.out.println(c);
        Class c1 = new String().getClass();
        System.out.println(c1);
    }
}
