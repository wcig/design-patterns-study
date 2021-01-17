package org.example.wcig.proxy.staticc.example;

public class Test {
    public static void main(String[] args) {
        Movable m = new TankLogProxy(new TankTimeProxy(new Tank()));
        m.move();
    }
}

interface Movable {
    void move();
}

class Tank implements Movable {
    @Override
    public void move() {
        System.out.println("tank move..");
    }
}

class TankTimeProxy implements Movable {
    private Movable m;

    public TankTimeProxy(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        m.move();
        long end = System.currentTimeMillis();
        System.out.println("time cost:" + (end-start));
    }
}

class TankLogProxy implements Movable {
    private Movable m;

    public TankLogProxy(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        System.out.println("start move >>");
        m.move();
        System.out.println("end move >>");
    }
}
