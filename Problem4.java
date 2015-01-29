/**
 * http://projecteuler.net/problem=4
 * Created by bas on 1/28/15.
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * <p/>
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {
    public static void main(String[] args) {
        int palindrome = ThreeDigitScan();
        if (palindrome < 0) {
            System.out.println("No palindrome found.");
        } else {
            System.out.println(ThreeDigitScan());
        }
    }

    private static int ThreeDigitScan() {
        int min_number = 100; // Smallest 3 digit numbers
        int max_palindrome = -1;
        for (int a = 999; a >= min_number; a--) {
            for (int b = 999; b >= min_number; b--) {
                int product = a * b;
                if (IsPalindrome(product)) {
                    if (product > max_palindrome) {
                        max_palindrome = product;
                    }
                }
            }
        }
        return max_palindrome;
    }

    private static boolean IsPalindrome(int number) {
        String str = String.valueOf(number);
        return new StringBuilder(str).reverse().toString().equals(str); // Is palindrome if reverse string is same
    }
}
