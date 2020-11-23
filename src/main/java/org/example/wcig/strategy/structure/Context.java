package org.example.wcig.strategy.structure;

/**
 * 使用策略上下文
 */
public class Context {
    /**
     * 使用策略对象
     */
    private Strategy strategy;
    /**
     * 构造函数，传入一个策略对象
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
}
