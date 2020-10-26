package mx.test1024;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDemo01 {
    public static void main(String[] args) throws ParseException {
        String date1 = "2001年1月1日";

        String date2 = "2001年1月3日";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");

        Date parse1 = sdf.parse(date1);

        Date parse2 = sdf.parse(date2);

        long time = parse1.getTime() - parse2.getTime();

        System.out.println(time);
        System.out.println(time / 1000 /3600 /24);

        SimpleDateFormat sd = new SimpleDateFormat("yyyy年MM月dd日");

        String str = sd.format(new Date());

        System.out.println(str);


        String s1 = "abc";

        String s2 = "xyz";

        show(s1,s2);

        System.out.println(s1+"-----"+s2);

    }

    static void show(String s1,String s2){
        s1 = s2+s1+"Q";

         s2 = "w"+s1;

    }
}
