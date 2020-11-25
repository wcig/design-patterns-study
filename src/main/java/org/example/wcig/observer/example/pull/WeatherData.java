package org.example.wcig.observer.example.pull;

import java.util.Observable;

public class WeatherData extends Observable {
    private int state; // 1.上课, 2.下课

    public void setState(int state) {
        this.state = state;
        setChanged();
        notifyObservers(state);
    }

    public int getState() {
        return state;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "state=" + state +
                '}';
    }
}
