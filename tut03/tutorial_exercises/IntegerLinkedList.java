package tut03.tutorial_exercises;

import java.util.Iterator;
import java.util.LinkedList;

public class IntegerLinkedList extends LinkedList<Integer> {
    public static void main(String[] args) {
        IntegerLinkedList list = new IntegerLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> i = list.evenIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    public Iterator<Integer> evenIterator() {
        return new Iterator<Integer>() {
            private int curIdx = 0;

            @Override
            public boolean hasNext() {
                while (curIdx < size()) {
                    if (get(curIdx) % 2 == 0) {
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
}
