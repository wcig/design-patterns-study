package org.example.wcig.prototype.structure;

public class ConcretePrototypeA implements Prototype {
    @Override
    public Prototype clone() {
        return new ConcretePrototypeA();
    }
}
