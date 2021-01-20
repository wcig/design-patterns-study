package org.example.wcig.command.example;

public class Test {
    public static void main(String[] args) {
        TextEditor t = new TextEditor("<text editor>");
        Command cmd = new InsertCommand(t);
        t.print();

        cmd.exec();
        t.print();

        cmd.undo();
        t.print();
    }
}

// out:
// <text editor>
// <text editor>666
// <text editor>
