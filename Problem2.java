/**
 * http://projecteuler.net/problem=2
 * Created by bas on 1/28/15.
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 * <p/>
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * <p/>
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */

public class Problem2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int sum = 0;
        while (a < 4000000) {
            int c = a + b;
            b = a;
            a = c;
            if (a % 2 == 0) {
                sum += a;
            }
        }
        System.out.println(sum);
    }
}
