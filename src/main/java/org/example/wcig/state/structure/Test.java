package org.example.wcig.state.structure;

public class Test {
    public static void main(String[] args) {
        Context c = new Context("A");
        c.request();

        c.setStateVal("B");
        c.request();
    }
}
