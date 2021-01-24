package org.example.wcig.mediator.structure;

public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void update() {
        mediator.changeColleague(this);
    }
}
