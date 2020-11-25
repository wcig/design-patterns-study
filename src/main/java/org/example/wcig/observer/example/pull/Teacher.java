package org.example.wcig.observer.example.pull;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("teacher receive update:" + o.toString() + ", " + arg);
        int state = (int)arg;
        if (state == 1) {
            System.out.println("老师回到教室..");
        } else {
            System.out.println("老师离开教室..");
        }
    }
}
