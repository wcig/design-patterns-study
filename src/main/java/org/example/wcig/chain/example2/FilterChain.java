package org.example.wcig.chain.example2;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    List<Filter> filterList = new ArrayList<>();
    int index = 0;

    public FilterChain add(Filter f) {
        filterList.add(f);
        return this;
    }

    public boolean doFilter(Request req, Response res) {
        if (index == filterList.size()) {
            return false;
        }

        Filter f = filterList.get(index);
        index++;
        return f.doFilter(req, res, this);
    }
}
