package org.example.wcig.chain.example2;

public class HtmlFilter implements Filter {
    @Override
    public boolean doFilter(Request req, Response res, FilterChain chain) {
        req.val += " -> HtmlFilterRequest";
        chain.doFilter(req, res);
        res.val += " -> HtmlFilterResponse";
        return true;
    }
}
