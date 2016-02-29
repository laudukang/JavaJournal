package me.laudukang.dev.outofmemory;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Created with IDEA
 * <p>Author: laudukang
 * <p>Date: 2016/2/29
 * <p>Time: 14:04
 * <p>Version: 1.0
 * <p>VM Args：-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeadOutOfMemory {
    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while (true) {
            list.add(new OOMObject());
            //System.out.println("total(k):"+Runtime.getRuntime().totalMemory()/1024+
            //        "  freeMemory(k):"+Runtime.getRuntime().freeMemory()/1024+
            //        "  maxMemory(k):"+Runtime.getRuntime().maxMemory()/1024+
            //        "  availableProcessors:"+Runtime.getRuntime().availableProcessors());
        }
    }

    static class OOMObject {
    }
}
//Console Result:
//java.lang.OutOfMemoryError: Java heap space
//        Dumping heap to java_pid7256.hprof ...
//        Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
//        at java.util.Arrays.copyOf(Arrays.java:3210)
//        at java.util.Arrays.copyOf(Arrays.java:3181)
//        at java.util.ArrayList.grow(ArrayList.java:261)
//        at java.util.ArrayList.ensureExplicitCapacity(ArrayList.java:235)
//        at java.util.ArrayList.ensureCapacityInternal(ArrayList.java:227)
//        at java.util.ArrayList.add(ArrayList.java:458)
//        at me.laudukang.dev.outofmemory.HeadOutOfMemory.main(HeadOutOfMemory.java:22)
//        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
//        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
//        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
//        at java.lang.reflect.Method.invoke(Method.java:497)
//        at com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)
//        Heap dump file created [28143768 bytes in 0.099 secs]