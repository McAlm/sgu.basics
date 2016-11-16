package de.commsult.sgu.basics.loops;

import java.util.Scanner;

/**
 * Write a program that asks the user to enter two words. 
 * The program then prints out both words on one line. 
 * The words will be separated by enough dots so that the total line length is 30:
 * Enter first word:
 * turtle
 * Enter second word
 * 153
 * turtle....................153
 * 
 * This could be used as part of an index for a book. 
 * To print out the dots, use System.out.print(".") inside a loop body.
 * You will need the length() method of class String that counts the number of characters in a String
 */
public class BookIndex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first word!");
        String first = scanner.next();
        
        System.out.println("Please enter the second word!");
        String second = scanner.next();

        //ToDo: implement here
        
    }

}
