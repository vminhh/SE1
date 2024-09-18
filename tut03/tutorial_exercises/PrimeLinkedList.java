package tut03.tutorial_exercises;

import java.util.Iterator;
import java.util.LinkedList;

public class PrimeLinkedList extends LinkedList<Integer> {
    public static void main(String[] args) {
        PrimeLinkedList list = new PrimeLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        Iterator<Integer> i = list.primeIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    public Iterator<Integer> primeIterator() {
        return new Iterator<Integer>() {
            private int curIdx = 0;

            @Override
            public boolean hasNext() {
                while (curIdx < size()) {
                    if (isPrime(get(curIdx))) {
                        return true;
                    }
                    curIdx++;
                }
                return false;
            }

            @Override
            public Integer next() {
                return get(curIdx++);
            }

        };
    }

    private static boolean isPrime(int n) {
        if (n < 2)
            return false;

        if (n == 2 || n == 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }

        return true;
    }
}
