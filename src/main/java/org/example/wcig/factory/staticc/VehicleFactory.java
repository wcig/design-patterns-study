package org.example.wcig.factory.staticc;

public class VehicleFactory {
    public static Vehicle createCar() {
        return new Car();
    }
    public static Vehicle createPlane() {
        return new Plane();
    }
}
