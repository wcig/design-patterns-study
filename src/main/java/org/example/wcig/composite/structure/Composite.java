package org.example.wcig.composite.structure;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    List<Component> children = new ArrayList<>();

    public void operation() {
        System.out.println("Composite operation..");
        for (Component c : this.children) {
            c.operation();
        }
    }

    public void add(Component c) {
        children.add(c);
    }

    public void remove(Component c) {
        children.remove(c);
    }

    public Component getChild(int i) {
        return children.get(i);
    }
}
