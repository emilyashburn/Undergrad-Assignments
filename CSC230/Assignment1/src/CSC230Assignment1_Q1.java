package csc230assignment1_q1;

/*
 * Write a program to evaluate the value of the following real valued function.
 *      f(x, y, z) = x^3 + y^3 + z^4 + (x + y) ^4 * z
 */

public class CSC230Assignment1_Q1 {

    public static void main(String[] args) {
        int x, y, z;

        //Test case 1: all positive ... Expected = 4023.0
        x = y = z = 3;
        Calculate(x, y, z);

        //Test case 2: all negative ... Expected = -3861.0
        x = y = z = -3;
        Calculate(x, y, z);

        //Test case 3: mix of positive and negative ... Expected = -3753.0
        x = y = 3;
        z = -3;
        Calculate(x, y, z);

        //Test case 4: mix of positive, negative, zero ... Expected = -135.0
        x = 3;
        y = 0;
        z = -3;
        Calculate(x, y, z);
    }

    static void Calculate(int x, int y, int z) {
        System.out.println(Math.pow(x, 3) + Math.pow(y, 3) + Math.pow(z, 4)
                + Math.pow((x + y), 4) * z);
    }

}
