package me.laudukang.dev.outofmemory;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * <p>Created with IDEA
 * <p>Author: laudukang
 * <p>Date: 2016/2/29
 * <p>Time: 19:09
 * <p>Version: 1.0
 * <p>VM Args：-Xmx20M -XX:MaxDirectMemorySize=10M
 */
public class DirectMemoryOOM {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws Exception {

        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true) {
            unsafe.allocateMemory(_1MB);
        }
    }
}
//Console Result
//Exception in thread "main" java.lang.OutOfMemoryError
//    at sun.misc.Unsafe.allocateMemory(Native Method)
//    at me.laudukang.dev.outofmemory.DirectMemoryOOM.main(DirectMemoryOOM.java:24)
//    at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
//    at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
//    at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
//    at java.lang.reflect.Method.invoke(Method.java:497)
//    at com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)