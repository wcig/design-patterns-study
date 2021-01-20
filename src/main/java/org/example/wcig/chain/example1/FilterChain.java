package org.example.wcig.chain.example1;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
    List<Filter> filterList = new ArrayList<>();
    int index = 0;

    public FilterChain add(Filter f) {
        filterList.add(f);
        return this;
    }

    @Override
    public boolean doFilter(Request req, Response res, FilterChain chain) {
        if (index == filterList.size()) {
            return false;
        }

        Filter f = filterList.get(index);
        index++;
        return f.doFilter(req, res, chain);
    }
}
