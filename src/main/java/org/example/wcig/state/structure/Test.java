package org.example.wcig.state.structure;

public class Test {
    public static void main(String[] args) {
        Context ca = new Context(new ConcreteStateA());
        ca.request();

        ca.setState(new ConcreteStateB());
        ca.request();
    }
}
