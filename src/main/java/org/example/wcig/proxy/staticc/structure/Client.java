package org.example.wcig.proxy.staticc.structure;

public class Client {
    public static void main(String[] args) {
        Subject s = new Proxy(new RealSubject());
        s.request();
    }
}
