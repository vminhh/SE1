package tut01;

import java.util.ArrayList;
import java.util.Collections;

public class MaxMinIntList extends ArrayList<Integer> {
    public Integer min() {
        if (this.isEmpty())
            throw new IllegalStateException(".....");
        return Collections.min(this);
    }

    public Integer max() {
        if (this.isEmpty())
            throw new IllegalStateException(".....");
        return Collections.max(this);
    }
}