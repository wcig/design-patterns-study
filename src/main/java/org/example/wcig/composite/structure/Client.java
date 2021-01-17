package org.example.wcig.composite.structure;

public class Client {
    public static void main(String[] args) {
        Composite c = new Composite();
        Component c11 = new Leaf();
        Composite c12 = new Composite();
        c.add(c11);
        c.add(c12);
    }
}
