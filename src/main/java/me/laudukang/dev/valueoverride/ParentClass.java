package me.laudukang.dev.valueoverride;

/**
 * <p>Created with IDEA
 * <p>Author: laudukang
 * <p>Date: 2016/3/2
 * <p>Time: 0:41
 * <p>Version: 1.0
 */
public class ParentClass {
    public static final String staticFinalField = "父类静态常量";
    public static String staticField = "父类静态变量";
    public final String finalField = "父类常量";
    public int i = 10;
    public String publicField = "父类变量--public";
    protected String protectedField = "父类变量--protected";
    /* friendly */ String friendlyField = "父类变量--friendly";
    private String privateField = "父类变量--private";

    // private的变量无法直接访问，因此我们给他增加了一个访问方法
    public String getPrivateFieldValue() {
        return privateField;
    }
}
