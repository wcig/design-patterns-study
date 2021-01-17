package org.example.wcig.proxy.staticc.structure;

public class Proxy implements Subject {
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        System.out.println("proxy start..");
        subject.request();
        System.out.println("proxy end..");
    }
}
