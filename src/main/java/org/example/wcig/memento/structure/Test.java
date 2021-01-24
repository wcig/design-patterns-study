package org.example.wcig.memento.structure;

public class Test {
    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState(1);
        Memento m = o.createMemento();
        Caretaker c = new Caretaker();
        c.saveMemento(m);

        o.setState(2);
        Memento mm = c.getMemento();
        System.out.println(mm.getState());
        System.out.println(o.getState());
    }
}
