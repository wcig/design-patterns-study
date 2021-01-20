package org.example.wcig.chain.example1;

public class SensitiveFilter implements Filter {
    @Override
    public boolean doFilter(Request req, Response res, FilterChain chain) {
        req.val += " -> SensitiveFilterRequest";
        chain.doFilter(req, res, chain);
        res.val += " -> SensitiveFilterResponse";
        return true;
    }
}
