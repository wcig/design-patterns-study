package org.example.wcig.composite.example;

import java.util.Collections;
import java.util.List;

public class CommentNode implements Node {
    private String name;

    public CommentNode(String name) {
        this.name = name;
    }

    @Override
    public Node add(Node node) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Node> children() {
        return Collections.emptyList();
    }

    @Override
    public String toXml() {
        return "<!--" + name + "-->";
    }
}
