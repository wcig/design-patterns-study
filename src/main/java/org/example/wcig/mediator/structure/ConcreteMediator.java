package org.example.wcig.mediator.structure;

public class ConcreteMediator extends Mediator {
    @Override
    public void changeColleague(Colleague c) {
        System.out.println("current colleague: " + c.getClass().getName());
    }
}
