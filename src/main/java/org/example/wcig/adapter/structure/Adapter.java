package org.example.wcig.adapter.structure;

public class Adapter implements Target {
    private Adaptee adaptee;

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
