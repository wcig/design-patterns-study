package org.example.wcig.prototype.structure;

public class ConcretePrototypeB implements Prototype {
    @Override
    public Prototype clone() {
        return new ConcretePrototypeB();
    }
}
