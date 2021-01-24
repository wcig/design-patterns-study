package org.example.wcig.state.structure;

public class ConcreteStateA extends State {
    @Override
    public void handle() {
        System.out.println("concrete state A handle...");
    }
}
