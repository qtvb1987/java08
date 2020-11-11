package iodemo;

public class Person {
    private int weight;

     public Person(int weight)throws WeightOutOfBoundsException{

      if(weight < 0 || weight > 300){

       throw new WeightOutOfBoundsException("体重不符合要求");

     }

      this.weight = weight;

     }
}
