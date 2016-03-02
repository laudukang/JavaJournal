package me.laudukang.dev;

/**
 * <p>Created with IDEA
 * <p>Author: laudukang
 * <p>Date: 2016/3/2
 * <p>Time: 0:56
 * <p>Version: 1.0
 */
public class FinalTest {// 在定义时初始化
    // 静态常量，在定义时初始化
    public static final int STATIC_D = 40;
    public static final int STATIC_E;

    // 静态常量，在静态初始化块中初始化
    static {
        STATIC_E = 50;
    }

    // 非静态final变量不能在静态初始化块中初始化
    // public final int C;
    // static {
    // C = 30;
    // }

    public final int A = 10;
    public final int B;
    public final int G;

    // 静态变量不能在初始化块中初始化
    // public static final int STATIC_F;
    // {
    // STATIC_F = 60;
    // }

    // 在初始化块中初始化
    {
        B = 20;
    }

    // 静态final变量不可以在构造器中初始化
    // public static final int STATIC_H;

    // 在构造器中初始化
    public FinalTest() {
        G = 70;

        // 静态final变量不可以在构造器中初始化
        // STATIC_H = 80;
        // 给final的变量第二次赋值时，编译会报错
        // A = 99;
        // STATIC_D = 99;
    }

    // final变量未被初始化，编译时就会报错
    // public final int I;

    // 静态final变量未被初始化，编译时就会报错
    // public static final int STATIC_J;
}
