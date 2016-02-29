package me.laudukang.dev.outofmemory;

/**
 * <p>Created with IDEA
 * <p>Author: laudukang
 * <p>Date: 2016/2/29
 * <p>Time: 16:17
 * <p>Version: 1.0
 * <p>VM Args：-Xss128k
 */
public class JavaVMStackSOF {
    private int stackLength = 1;

    public static void main(String[] args) throws Throwable {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:" + oom.stackLength);
            throw e;
        }
    }

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }
}
//Console Result:
//Without VM Args
//stack length:19226
//        Exception in thread "main" java.lang.StackOverflowError
//        at me.laudukang.dev.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:16)

//With VM Args：-Xss128k
//stack length:963
//        Exception in thread "main" java.lang.StackOverflowError
//        at me.laudukang.dev.outofmemory.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:15)