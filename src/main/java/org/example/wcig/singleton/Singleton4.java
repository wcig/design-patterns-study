package org.example.wcig.singleton;

/**
 * 懒汉式（懒加载，双重校验，线程安全）
 */
public class Singleton4 {
    private static Singleton4 instance;

    private Singleton4(){}

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
