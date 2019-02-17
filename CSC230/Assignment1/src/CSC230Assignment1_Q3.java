/**
 * Solutions for a quadratic equation ax^2 + bx + c = 0 where a != 0 are as
 * follows:
 *      r1 = -b + sqrt(b^2 - 4ac) / 2a
 *      r2 = -b - sqrt(b^2 - 4ac) / 2a
 *
 * if b^2 - 4* ac < 0, equation doesn't have real roots. If it is 0 there is one
 * root (r1 = r2). Write a Java program to read a, b and c from keyboard and
 * find the roots, if they exist.
 */
package csc230assignment1_q3;

import java.util.Scanner;

public class CSC230Assignment1_Q3 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a, b, c;

        System.out.println("Enter values for a, b, and c ... Separate by "
                + "spaces (ex. 5 14 3): ");
        a = kb.nextInt();
        b = kb.nextInt();
        c = kb.nextInt();

        Calculate(a, b, c);
    }

    static void Calculate(int a, int b, int c) {
        double r1, r2;
        double determinate = Math.pow(b, 2) - (4 * a * c);

        r1 = ((-b + Math.sqrt(determinate)) / (2 * a));
        r2 = ((-b - Math.sqrt(determinate)) / (2 * a));

        if (determinate < 0) {
            System.out.println("There are no real roots for those inputs.");
        } else if (determinate == 0) {
            System.out.println("There is one real root: " + r1);
        } else {
            System.out.println("There are two roots: " + r1 + " and " + r2);
        }
    }

}
