package org.example.wcig.mediator.structure;

public class Test {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague ca = new ConcreteColleagueA(mediator);
        Colleague cb = new ConcreteColleagueB(mediator);
        ca.update();
        cb.update();
    }

    // out:
    // current colleague: org.example.wcig.mediator.structure.ConcreteColleagueA
    // current colleague: org.example.wcig.mediator.structure.ConcreteColleagueB
}
