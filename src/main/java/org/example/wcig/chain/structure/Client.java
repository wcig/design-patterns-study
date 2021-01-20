package org.example.wcig.chain.structure;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Handler> handlerList = new ArrayList<>();
        handlerList.add(new ConcreteHandlerA());
        handlerList.add(new ConcreteHandlerB());
        Request r = new Request("req");
        for (Handler h : handlerList) {
            h.handleRequest(r);
        }
    }
}
