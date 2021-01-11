package org.example.wcig.factory.staticc;

/**
 * 静态工厂: 创建实例方法为静态方法，或者工厂实例通过静态方法获取
 */
public class Test {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.createCar();
        car.move();
        Vehicle plane = VehicleFactory.createPlane();
        plane.move();
    }
}

// car move..
// plane move..