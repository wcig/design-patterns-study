package org.example.wcig.command.structure;

public class Client {
    public static void main(String[] args) {
        Command cmd = new ConcreteCommand(new Receiver());
        cmd.execute();
    }
}
