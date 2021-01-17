package org.example.wcig.composite.example;

public class Test {
    public static void main(String[] args) {
        Node root = new ElementNode("html");
        Node head = new ElementNode("head")
                .add(new TextNode("111"));
        Node text = new TextNode("222");
        Node comment = new CommentNode("333");
        root.add(head).add(text).add(comment);
        System.out.println(root.toXml());
    }
}
