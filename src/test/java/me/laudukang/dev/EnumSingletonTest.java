package me.laudukang.dev;

import org.junit.Test;

/**
 * <p>Created with IDEA
 * <p>Author: laudukang
 * <p>Date: 2016/3/2
 * <p>Time: 0:25
 * <p>Version: 1.0
 */
public class EnumSingletonTest {
    @Test
    public void test() {
        Singleton.INSTANCE.read();
        Singleton.INSTANCE.write();
    }

    public enum Singleton {
        INSTANCE {
            @Override
            protected void read() {
                System.out.println("read");
            }

            @Override
            protected void write() {
                System.out.println("write");
            }
        };

        protected abstract void read();

        protected abstract void write();

    }
}
