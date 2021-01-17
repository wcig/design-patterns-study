package org.example.wcig.adapter.example;

import java.util.concurrent.Callable;

public class Task implements Callable<Long> {
    private long num;

    public Task(long num) {
        this.num = num;
    }


    @Override
    public Long call() throws Exception {
        long l = 0L;
        for (long n=1; n<=this.num; n++) {
            l += n;
        }
        System.out.println("result:" + l);
        return l;
    }
}
