package org.example.wcig.chain.structure;

public class ConcreteHandlerB implements Handler {
    @Override
    public void handleRequest(Request r) {
        System.out.println("concrete handler B process:" + r.getName());
    }
}
