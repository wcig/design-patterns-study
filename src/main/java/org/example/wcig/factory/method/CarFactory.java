package org.example.wcig.factory.method;

public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createCar() {
        return new Car();
    }
}
