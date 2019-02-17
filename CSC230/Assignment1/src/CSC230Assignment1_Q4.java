/**
 * Write a program to determine all pairs of positive integers, (a,b), such that
 * a < b < 1000 and (a^2 + b^2 + 1) / (ab) is an integer.
 *
 * Note: Your program should have a method that takes 1000 as a parameter,
 * say n, and print all valid pairs as (a, b)
 */
package csc230assignment1_q4;

public class CSC230Assignment1_Q4 {

    public static void main(String[] args) {

        /**
         * Test case n = 1000 Expected number of pairs : 7 (1,2) (2,5) (5,13)
         * (13,34) (34,89) (89,233) (233,610)
         */
        int number = 1000;
        positivePairs(number);

    }

    static void positivePairs(int n) {
        double value;
        for (int b = 2; b < n; b++) {
            for (int a = 1; a < b; a++) {
                value = (Math.pow(a, 2) + Math.pow(b, 2) + 1) / (a * b);
                if (value == (int) value) {
                    System.out.println("(" + a + ", " + b + ")");
                }
            }
        }
    }

}
