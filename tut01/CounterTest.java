package tut01;

public class CounterTest {
    public static void main(String[] args) {
        Counter cnt = new Counter();

        for (int i = 0; i < 100; i++) {
            cnt.incr();
        }

        System.out.println(cnt.get());
    }
}
