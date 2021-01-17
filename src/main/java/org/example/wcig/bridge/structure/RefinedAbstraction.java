package org.example.wcig.bridge.structure;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor impl) {
        this.impl = impl;
    }

    @Override
    public void operation() {
        // ...
    }
}
