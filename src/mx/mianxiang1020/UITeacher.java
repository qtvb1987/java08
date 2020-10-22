package mx.mianxiang1020;

public  class UITeacher extends Employee implements  Draw {
    @Override
    public void draw() {
        UITeacher uiTeacher=new UITeacher();
        uiTeacher.setName("李四");
        uiTeacher.setAge(28);
        uiTeacher.setSex("女");
        System.out.println("姓名: "+uiTeacher.getName()+",性别: "+uiTeacher.getSex()+",年龄: "+uiTeacher.getAge()+"的UI老师正在教大家绘图");
    }

    @Override
    public void work() {
        UITeacher uiTeacher=new UITeacher();
        uiTeacher.setName("李四");
        uiTeacher.setAge(28);
        uiTeacher.setSex("女");
        System.out.println("姓名: "+uiTeacher.getName()+",性别: "+uiTeacher.getSex()+",年龄: "+uiTeacher.getAge()+"的UI老师正在讲解产品设计工作流程");

    }
}
