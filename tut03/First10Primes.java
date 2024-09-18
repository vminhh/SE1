package tut03;

import java.util.ArrayList;
import java.util.List;

public class First10Primes {
    public static void main(String[] args) {
        List<Integer> primes = new ArrayList<>();
        int n = 2;

        do {
            if (isPrime(n)) {
                primes.add(n);
            }
            n++;
        } while (primes.size() < 10);

        primes.forEach(System.out::println);
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
