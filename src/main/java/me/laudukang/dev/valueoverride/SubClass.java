package me.laudukang.dev.valueoverride;

/**
 * <p>Created with IDEA
 * <p>Author: laudukang
 * <p>Date: 2016/3/2
 * <p>Time: 0:42
 * <p>Version: 1.0
 */
public class SubClass extends ParentClass {
    public static final String staticFinalField = "子类静态常量";
    public static String staticField = "子类静态变量";
    public final String finalField = "子类常量";
    public int i = 30;
    public String publicField = "子类变量--public";
    protected String protectedField = "子类变量--protected";
    /* friendly */ String friendlyField = "子类变量--friendly";
    private String privateField = "子类变量--private";

    public static void main(String[] args) {
        ParentClass parentClass1 = new SubClass();
        SubClass subClass1 = new SubClass();
        System.out.println(parentClass1.i + subClass1.i);//10+30
        System.out.println();

        // 为了便于查阅，我们统一按照private、friendly、protected、public的顺序
        // 输出下列三种情况中变量的值
        // ParentClass类型，ParentClass对象
        ParentClass parentClass = new ParentClass();
        System.out.println("ParentClass parentClass = new ParentClass();");
        System.out.println(parentClass.getPrivateFieldValue());//父类变量--private
        System.out.println(parentClass.friendlyField);//父类变量--friendly
        System.out.println(parentClass.protectedField);//父类变量--protected
        System.out.println(parentClass.publicField);//父类变量--public
        System.out.println();

        // ParentClass类型，SubClass对象
        ParentClass subClass = new SubClass();
        System.out.println("ParentClass subClass = new SubClass();");
        System.out.println(subClass.getPrivateFieldValue());//子类变量--private
        System.out.println(subClass.friendlyField);//父类变量--friendly
        System.out.println(subClass.protectedField);//父类变量--protected
        System.out.println(subClass.publicField);//父类变量--public
        System.out.println();

        // SubClass类型，SubClass对象
        SubClass subClazz = new SubClass();
        System.out.println("SubClass subClazz = new SubClass();");
        System.out.println(subClazz.getPrivateFieldValue());//子类变量--private
        System.out.println(subClazz.friendlyField);//子类变量--friendly
        System.out.println(subClazz.protectedField);//子类变量--protected
        System.out.println(subClazz.publicField);//子类变量--public
        System.out.println();

        // 静态变量、常量
        SubClass subClass3 = new SubClass();
        System.out.println(SubClass.staticField);//子类静态变量
        // 注意，这里的subClass变量，不是SubClass类
        System.out.println(subClass3.finalField);//子类常量
        System.out.println(SubClass.staticFinalField);//子类静态常量
    }

    // private的变量无法直接访问，因此我们给他增加了一个访问方法
    public String getPrivateFieldValue() {
        return privateField;
    }
}
