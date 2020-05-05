package org.example.wcig.singleton;

/**
 * 恶汉式（初始化时加载，线程安全，执行效率高）（工作中一般使用这种）
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();

    private Singleton3(){}

    public static Singleton3 getInstance() {
        return instance;
    }
}
