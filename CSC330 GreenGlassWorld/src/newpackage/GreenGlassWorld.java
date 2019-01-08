/*
 * Emily Ashburn
 * Dr. Prashanti Manda
 * CSC330-01 F18
 * Assignment 1
 *
 * ---------------------
 * Write a Java program to determine whether an input word is in the "Green
 * Glass World". Any word that is spelled with two consecutive letters of the
 * same kind, such as "grass" or "green" or "pizza" is said to be in the world.
 * 
 * Your program will take one word as input from the user and return a 
 * True/False answer. Your program should only accept single worlds (alphabets
 * only) and not phrases. Submit a .java file.
 * ---------------------
 * 
 * The function of this program is to detect whether or not the user's input 
 * (string of only one word) is in the Green Glass World. The user's input must
 * be valid:
 *      • Cannot be empty
 *      • Cannot contain non-alphabetical characters (5, *, ?, etc)
 * Words in the Green Glass World:
 *      "apple", "marRiage", "passive"
 * Words NOT in the Green Glass World:
 *      "child" (no equal chars), "robot" (no consecutive equal chars),
 *      "red apple" (string would accept "red" and leave out "apple")
 */

package newpackage;

import java.util.Scanner;

public class GreenGlassWorld {

    public static void main(String[] args) {
        boolean isInWorld = false;

        Scanner kb = new Scanner(System.in);
        String newWord;

        do {
            System.out.println("Enter a word: ");
            newWord = kb.next().toLowerCase();
        } while (newWord.equals(""));

        //
        
        if (newWord.length() >= 2 && containsOnlyAlphabets(newWord)) {
            for (int i = 0, j = 1; j < newWord.length(); i++, j++) {
                if (newWord.charAt(i) == newWord.charAt(j)) {
                    isInWorld = true;
                }
            }
            System.out.println(isInWorld);
        } else {
            System.out.println(isInWorld);
        }

    }

    static boolean containsOnlyAlphabets(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

}
