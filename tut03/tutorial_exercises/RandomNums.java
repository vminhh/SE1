package tut03.tutorial_exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNums {
    public static void main(String[] args) {
        List<Integer> randNums = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            randNums.add(rand.nextInt(100) + 1);
        }

        randNums.forEach(System.out::println);
    }
}
