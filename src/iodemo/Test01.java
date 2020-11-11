package iodemo;

public class Test01 {
    public static void main(String[] args) {
        try {
            Person person=new Person(700);
        } catch (WeightOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
