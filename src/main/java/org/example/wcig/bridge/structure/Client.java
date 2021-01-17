package org.example.wcig.bridge.structure;

public class Client {
    public static void main(String[] args) {
        Abstraction a1 = new RefinedAbstraction(new ConcreteImplementorA());
        Abstraction a2 = new RefinedAbstraction(new ConcreteImplementorB());
    }
}
