package org.example.wcig.factory.simple;

/**
 * 简单工厂模式： 扩展性不好
 */
public class Test {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();
        Vehicle car = factory.createCar();
        car.move();
        Vehicle plane = factory.createPlane();
        plane.move();
    }
}

// car move..
// plane move..