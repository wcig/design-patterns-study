package org.example.wcig.builder.structure;

public class Director {
    public Product construct() {
        ConcreteBuilder b = new ConcreteBuilder();
        b.buildPart();
        return b.getResult();
    }
}
