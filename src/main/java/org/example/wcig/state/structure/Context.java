package org.example.wcig.state.structure;

public class Context {
    private String stateVal;
    private State state;

    public Context(String stateVal) {
        this.stateVal = stateVal;
    }

    public void setStateVal(String stateVal) {
        this.stateVal = stateVal;
    }

    public void request() {
        if (stateVal.equals("A")) {
            state = new ConcreteStateA();
        } else if (stateVal.equals("B")) {
            state = new ConcreteStateB();
        }
        state.handle();
    }
}
