package org.example.wcig.prototype.structure;

public class Client {
    public static void main(String[] args) {
        Prototype pa1 = new ConcretePrototypeA();
        Prototype pa2 = pa1.clone();
    }
}
