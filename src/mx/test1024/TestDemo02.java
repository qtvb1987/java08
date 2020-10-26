package mx.test1024;

public class TestDemo02 {
    public static void main(String[] args) {
        String[] strs = {"kkbJava","asdjavaccc","Jaasdhva","siaiq","javacjavaz","iloveJava"};
        String strsnew="";
        for(int i=0;i<strs.length;i++){
            String option=strs[i];
            String optionnew="";
            if(option.toLowerCase().contains("java")){
                optionnew=option.toLowerCase().replace("java","").toUpperCase();
            }
            else {
                optionnew=option.toUpperCase();
            }
            strsnew+=optionnew+",";
        }
        System.out.println(strsnew);
    }
}
