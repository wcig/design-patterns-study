package org.example.wcig.command.example;

public class TextEditor {
    private StringBuilder buf = new StringBuilder();
    final String s = "666";

    public TextEditor(String str) {
        buf.append(str);
    }

    public void rpush() {
        buf.append(s);
    }

    public void rpop() {
        if (buf.length() > 0) {
            buf.delete(buf.length() - s.length(), buf.length());
        }
    }

    public void print() {
        System.out.println(buf.toString());
    }
}
