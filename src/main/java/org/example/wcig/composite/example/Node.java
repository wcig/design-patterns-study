package org.example.wcig.composite.example;

import java.util.List;

public interface Node {
    Node add(Node node);
    List<Node> children();
    String toXml();
}
