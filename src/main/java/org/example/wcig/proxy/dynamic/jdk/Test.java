package org.example.wcig.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        // 生成动态代理创建的代理class文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        Tank tank = new Tank();
        Movable m = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Movable.class},
                // 具体实现类
                new TankLogProxy(tank)

                // 匿名内部类
                // new InvocationHandler() {
                //     @Override
                //     public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //         System.out.println("method:" + method.getName() + " start >>");
                //         Object o = method.invoke(tank, args);
                //         System.out.println("method:" + method.getName() + " end >>");
                //         return o;
                //     }
                // }
                );
        m.move();
    }
}

class TankLogProxy implements InvocationHandler {
    Movable m;

    public TankLogProxy(Movable m) {
        this.m = m;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method:" + method.getName() + " start >>");
        Object o = method.invoke(m, args);
        System.out.println("method:" + method.getName() + " end >>");
        return o;
    }
}

interface Movable {
    void move();
}

class Tank implements Movable {
    @Override
    public void move() {
        System.out.println("tank move..");
    }
}