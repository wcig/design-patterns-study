package org.example.wcig.mediator.structure;

public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void update() {
        mediator.changeColleague(this);
    }
}
