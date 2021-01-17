package org.example.wcig.proxy.dynamic.cjlib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Tank.class);
        enhancer.setCallback(new LogMethodInterceptor());
        Tank tank = (Tank) enhancer.create();
        tank.move();
    }
}

class LogMethodInterceptor implements MethodInterceptor {
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(o.getClass().getSuperclass().getName());
        System.out.println("method:" + method.getName() + " start >>");
        Object obj = methodProxy.invokeSuper(o, objects);
        System.out.println("method:" + method.getName() + " end >>");
        return obj;
    }
}

class Tank {
    public void move() {
        System.out.println("tank move..");
    }
}
