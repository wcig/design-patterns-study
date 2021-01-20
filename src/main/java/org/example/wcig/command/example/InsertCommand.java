package org.example.wcig.command.example;

public class InsertCommand implements Command {
    private TextEditor textEditor;

    public InsertCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void exec() {
        textEditor.rpush();
    }

    @Override
    public void undo() {
        textEditor.rpop();
    }
}
