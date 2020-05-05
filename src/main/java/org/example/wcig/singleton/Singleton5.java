package org.example.wcig.singleton;

/**
 * 静态内部类（懒加载，线程安全）
 */
public class Singleton5 {
    private Singleton5(){}

    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    public static Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
