package mx.mianxiang1020;

public  class JavaTeacher extends Employee{
    @Override
    public void work() {
        JavaTeacher javaTeacher=new JavaTeacher();
        javaTeacher.setName("张三");
        javaTeacher.setAge(38);
        javaTeacher.setSex("男");
        System.out.println("姓名: "+javaTeacher.getName()+",性别: "+javaTeacher.getSex()+",年龄: "+javaTeacher.getAge()+"的java老师正在讲解面向对象");
    }
}
