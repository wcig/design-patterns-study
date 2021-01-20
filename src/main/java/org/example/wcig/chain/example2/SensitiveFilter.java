package org.example.wcig.chain.example2;

public class SensitiveFilter implements Filter {
    @Override
    public boolean doFilter(Request req, Response res, FilterChain chain) {
        req.val += " -> SensitiveFilterRequest";
        chain.doFilter(req, res);
        res.val += " -> SensitiveFilterResponse";
        return true;
    }
}
