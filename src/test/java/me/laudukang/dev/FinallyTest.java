package me.laudukang.dev;

/**
 * <p>Created with IDEA
 * <p>Author: laudukang
 * <p>Date: 2016/3/2
 * <p>Time: 1:02
 * <p>Version: 1.0
 */
public class FinallyTest {// 测试return语句

    public static void main(String[] args) {
        FinallyTest ft = new FinallyTest();
        // 测试return语句
        ft.testReturn();
        System.out.println();

        // 测试continue语句
        ft.testContinue();
        System.out.println();

        // 测试break语句
        ft.testBreak();
    }

    public ReturnClass testReturn() {
        try {
            return new ReturnClass();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("执行了finally语句");
        }
        return null;
    }

    // 测试continue语句
    public void testContinue() {
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println(i);
                if (i == 1) {
                    continue;
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("执行了finally语句");
            }
        }
    }

    // 测试break语句
    public void testBreak() {
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println(i);
                if (i == 1) {
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("执行了finally语句");
            }
        }
    }
}

class ReturnClass {
    public ReturnClass() {
        System.out.println("执行了return语句");
    }
}
//Console Result
//        执行了return语句
//        执行了finally语句
//
//        0
//        执行了finally语句
//        1
//        执行了finally语句
//        2
//        执行了finally语句
//
//        0
//        执行了finally语句
//        1
//        执行了finally语句