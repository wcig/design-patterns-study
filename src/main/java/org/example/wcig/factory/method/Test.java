package org.example.wcig.factory.method;

/**
 * 工厂方法： 对产品的扩展
 */
public class Test {
    public static void main(String[] args) {
        VehicleFactory factory = new CarFactory();
        Vehicle car = factory.createCar();
        car.move();
    }
}
