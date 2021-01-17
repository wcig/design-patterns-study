package org.example.wcig.bridge.example;

public class Test {
    public static void main(String[] args) {
        Gift g1 = new ColdGift(new Book());
        Gift g2 = new ColdGift(new Flower());
        Gift g3 = new WarmGift(new Book());
        Gift g4 = new WarmGift(new Flower());
    }
}
