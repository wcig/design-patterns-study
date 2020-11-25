package org.example.wcig.observer.structure;

import java.util.List;

/**
 * 主题Subject
 */
public abstract class Subject {
    private List<Observer> list;

    public void attach(Observer obs) {
        list.add(obs);
    }

    public void detach(Observer obs) {
        list.remove(obs);
    }

    public void notifyObservers() {
        for (Observer obs: list) {
            obs.update();
        }
    }
}
