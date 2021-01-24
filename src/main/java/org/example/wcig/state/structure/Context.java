package org.example.wcig.state.structure;

public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void moveState(State state) {
        this.state = state;
    }

    public void request() {
        state.handle();
    }
}
