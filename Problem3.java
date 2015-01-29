import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://projecteuler.net/problem=3
 * Created by bas on 1/28/15.
 * <p/>
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */


public class Problem3 {
    public static void main(String[] args) {
        long number = 600851475143L;
        Object max = Collections.max(PrimeFactors(number));
        System.out.println(max);
    }

    private static List PrimeFactors(long number) {
        long n = number;
        List<Long> factors = new ArrayList<Long>();

        for (long i = 2; i <= n / i; i++) { // Factors can't be bigger than number / largest known factor
            while (n % i == 0) { // As long as n is still divisible by i
                factors.add(i);  // i is a prime factor of n
                n /= i;
            }
        }
        if (n > 1) { // If what remains is not 1, then n is also a prime factor of number
            factors.add(n);
        }
        return factors;
    }
}
