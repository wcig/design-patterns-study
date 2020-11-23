package org.example.wcig.strategy.example;

public class Test {
    public static void main(String[] args) {
        Context c = new Context(new StrategyAdd());
        System.out.println("add: " + c.execute(10, 5));

        c.setStrategy(new StrategySubtract());
        System.out.println("subject: " + c.execute(10, 5));

        c.setStrategy(new StrategyMultiply());
        System.out.println("multiply: " + c.execute(10, 5));
    }
}

// output:
// add: 15
// subject: 5
// multiply: 50
