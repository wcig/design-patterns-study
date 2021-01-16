package org.example.wcig.builder.structure;

public class ConcreteBuilder implements Builder {
    private Product product = new Product();

    @Override
    public void buildPart() {
        // set value
    }

    public Product getResult() {
        return this.product;
    }
}
