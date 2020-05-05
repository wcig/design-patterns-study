package org.example.wcig.singleton;

/**
 * 懒汉式（懒加载，线程安全，执行效率低）
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2(){}

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
