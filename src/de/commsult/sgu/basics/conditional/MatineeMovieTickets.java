package de.commsult.sgu.basics.conditional;

import java.util.Scanner;

/**
 * Write a program that determines the price of a movie ticket. 
 * The program asks for the customer's age and for the time on a 24-hour clock 
 * (where noon is 1200 and 4:30PM is 1630). 
 * The normal adult ticket price is $8.00, however the adult matinee price is $5.00. 
 * Adults are those over 13 years. The normal children's ticket price is $4.00, 
 * however the children's matinee price is $2.00. 
 * Assume that a matinee starts at any time earlier than 5pm (1700).
 * Get the information from the user and then use nested if statements to determine the ticket price. 
 * It is usually a good idea to separate the "information gathering phase" (asking the user for age and time) 
 * from the "processing phase" of a program (deciding on the ticket price).
 * There are many ways in which the if statements can be nested. 
 * Sketch out a flowchart as you design your program.
 *
 */
public class MatineeMovieTickets {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = scanner.nextInt();
        System.out.println("Please enter the time:");
        int time = scanner.nextInt();
        double price;

    }

}
