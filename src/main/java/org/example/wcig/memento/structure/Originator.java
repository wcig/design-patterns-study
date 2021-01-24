package org.example.wcig.memento.structure;

public class Originator {
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }
}
