package tut01.counter;

public class Counter {
    int count;

    public Counter() {
        this.count = 0;
    }

    public int get() {
        return count;
    }

    public void incr() {
        this.count++;
    }
}
