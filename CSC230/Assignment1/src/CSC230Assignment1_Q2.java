/**
 * Write a program that inputs a 5-digit integer, separates the integer into its
 * digits and prints them separated by tabs each. For example, if the user types
 * in 42339, the program should print:
 *      4   2   3   3   9
 *
 * Note: Do not convert integer to a String and use String class methods to
 * print it. You need to have a method that takes any arbitrary positive integer
 * as an argument.
 */
package csc230assignment1_q2;

public class CSC230Assignment1_Q2 {

    public static void main(String[] args) {
        
        //Test case 1: given example 42339 ... Expected = 4   2   3   3   9
        int x = 42339;
        printDigits(x);
        System.out.println();
        
        //Test case 2: 6-digit int 559966 ... Expected = 5   5   9   9   6   6
        x = 559966;
        printDigits(x);
    }

    static void printDigits(int x) {
        if (x == 0) {
            return;
        }
        System.out.print(x % 10 + "\t");
        printDigits(x / 10);
    }
}
