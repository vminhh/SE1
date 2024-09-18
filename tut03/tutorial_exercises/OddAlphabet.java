package tut03.tutorial_exercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OddAlphabet {

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            l1.add((int) c);
        }

        List<Integer> l2 = new ArrayList<>();
        Iterator<Integer> iterator = l1.iterator();
        while (iterator.hasNext()) {
            int charCode = iterator.next();
            if (charCode % 2 != 0) {
                l2.add(charCode);
            }
        }

        System.out.println("l1: " + l1);
        System.out.println("l2: " + l2);
    }
}
