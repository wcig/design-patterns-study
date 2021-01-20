package org.example.wcig.chain.example2;

public class Test {
    public static void main(String[] args) {
        FilterChain chain = new FilterChain().add(new HtmlFilter()).add(new SensitiveFilter());
        Request req = new Request("req");
        Response res = new Response("res");
        chain.doFilter(req, res);
        System.out.println(req.val);
        System.out.println(res.val);
    }
}

// out:
// req -> HtmlFilterRequest -> SensitiveFilterRequest
// res -> SensitiveFilterResponse -> HtmlFilterResponse
