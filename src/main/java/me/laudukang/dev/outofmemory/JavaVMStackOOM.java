package me.laudukang.dev.outofmemory;

/**
 * <p>Created with IDEA
 * <p>Author: laudukang
 * <p>Date: 2016/2/29
 * <p>Time: 16:20
 * <p>Version: 1.0
 * <p>VM Args：-Xss2M
 */
public class JavaVMStackOOM {
    int i = 0;

    public static void main(String[] args) throws Throwable {
        JavaVMStackOOM oom = new JavaVMStackOOM();

        try {
            oom.stackLeakByThread();
        } catch (Throwable e) {
            System.out.println("thread num:" + oom.i);
            throw e;
        }
    }

    private void dontStop() {
        while (true) {
        }
    }

    public void stackLeakByThread() {

        while (true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            i++;
            System.out.println("i=" + i);
            thread.start();
        }
    }
}
//Console Result
//System Halted