package org.example.wcig.chain.example2;

public interface Filter {
    boolean doFilter(Request req, Response res, FilterChain chain);
}
