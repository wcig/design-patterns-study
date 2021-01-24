package org.example.wcig.memento.structure;

public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void saveMemento(Memento memento) {
        this.memento = memento;
    }
}
