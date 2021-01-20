package org.example.wcig.chain.example1;

public class HtmlFilter implements Filter {
    @Override
    public boolean doFilter(Request req, Response res, FilterChain chain) {
        req.val += " -> HtmlFilterRequest";
        chain.doFilter(req, res, chain);
        res.val += " -> HtmlFilterResponse";
        return true;
    }
}
