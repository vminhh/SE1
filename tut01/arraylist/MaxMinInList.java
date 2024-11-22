package tut01.arraylist;

import java.util.*;

public class MaxMinInList extends ArrayList<Integer> {
    public Integer min() {
        if (!this.isEmpty()) return Collections.min(this);

        throw new IllegalStateException();
    }

    public Integer max() {
        if (!this.isEmpty()) return Collections.max(this);

        throw new IllegalStateException();
    }
}
