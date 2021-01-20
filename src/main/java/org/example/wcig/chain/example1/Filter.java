package org.example.wcig.chain.example1;

public interface Filter {
    boolean doFilter(Request req, Response res, FilterChain chain);
}
