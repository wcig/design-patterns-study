package org.example.wcig.observer.example.pull;

import java.util.Observable;
import java.util.Observer;

public class Student implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("student receive update:" + o.toString() + ", " + arg);
        int state = (int) arg;
        if (state == 1) {
            System.out.println("学生回到教室..");
        } else {
            System.out.println("学生离开教室..");
        }
    }
}
