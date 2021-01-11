package org.example.wcig.factory.abstractt;

/**
 * 抽象工厂： 对产品族的扩展
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory f1 = new ConcreteFactory1();
        AbstractProductA a1 = f1.createProductA();
        AbstractProductB b1 = f1.createProductB();
        a1.run();
        b1.move();

        AbstractFactory f2 = new ConcreteFactory2();
        AbstractProductA a2 = f2.createProductA();
        AbstractProductB b2 = f2.createProductB();
        a2.run();
        b2.move();
    }
}

// a1 run..
// b1 move..
// a2 run..
// b2 move..