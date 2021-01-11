package org.example.wcig.factory.simple;

public class VehicleFactory {
    public Vehicle createCar() {
        return new Car();
    }
    public Vehicle createPlane() {
        return new Plane();
    }
}
