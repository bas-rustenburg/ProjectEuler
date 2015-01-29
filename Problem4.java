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
        int minnumber = 100; // Smallest 3 digit numbers
        for (int a = 999; a >= minnumber; a--) {
            for (int b = 999; b >= minnumber; b--) {
                int product = a * b;
                if (IsPalindrome(product)) {
                    return product;
                }
            }
        }
        return -1;
    }

    private static boolean IsPalindrome(int number) {
        String str = String.valueOf(number);
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
