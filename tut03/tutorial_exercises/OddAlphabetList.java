package tut03.tutorial_exercises;

import java.util.ArrayList;
import java.util.List;

public class OddAlphabetList {
    public static void main(String[] args) {
        List<Character> oddAlphabets = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            if (isOddAlphabet(c)) {
                oddAlphabets.add(c);
                oddAlphabets.add((char) (c - 32));
            }
        }

        oddAlphabets.forEach(System.out::println);
    }

    private static boolean isOddAlphabet(char c) {
        if ((int) c % 2 != 0)
            return true;
        return false;
    }
}
