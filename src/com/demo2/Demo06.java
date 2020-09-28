package com.demo2;

/**
 * 逻辑运算符
 */
public class Demo06 {
    public static void main(String[] args) {
      //  & | ^ !

        boolean a=true;
        boolean b=false;
        //逻辑与 & : 多个条件同时成立 其结果是true 否则false
        System.out.println(a&b);
        System.out.println(true&true);
        System.out.println(true&false);
        //只要表达式是布尔类型就可以使用逻辑运算符去拼接
        System.out.println(1>2&3<1);
        //逻辑 或 | 只要有一个条件成立 其结果是true 都不成立结果为false
        System.out.println("a|b="+(a|b));
        System.out.println("true|true="+(true|true));
        System.out.println("true|false="+(true|false));
        System.out.println("false|false="+(false|false));

        //异或^ 相同条件输出false 不相同条件输出true
        System.out.println("异或^");
        System.out.println(true^true);
        System.out.println(false^false);
        System.out.println(false^true);

        //! 非 取反
        System.out.println("! 非 取反");
        System.out.println(!true);
        System.out.println(!false);

        //短路与 && 其结果与& 一样 效率高于逻辑与 但是结果一样
        System.out.println(true&&false);
        System.out.println(true&&true);
        int i=1;
        System.out.println(i+1>2&&++i<4);//++i没执行，因为前面条件为false,后面没执行
        System.out.println("i="+i);
        //短路或 || 其结果与| 一样
    }
}
