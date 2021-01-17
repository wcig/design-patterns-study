package org.example.wcig.proxy.staticc.structure;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("real subject request..");
    }
}
