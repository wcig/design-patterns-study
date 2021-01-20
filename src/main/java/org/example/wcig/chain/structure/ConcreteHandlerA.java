package org.example.wcig.chain.structure;

public class ConcreteHandlerA implements Handler {
    @Override
    public void handleRequest(Request r) {
        System.out.println("concrete handler A process:" + r.getName());
    }
}
