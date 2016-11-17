package de.commsult.sgu.basics.conditional;

import java.util.Scanner;

/**
 * This class demonstrates a two way decision, often called a binary decision
 *
 */
public class A_NumberTesterTwoWayDecision {

    public static void main(String[] args) {
        {
            Scanner scan = new Scanner(System.in);
            int num;

            System.out.println("Enter an integer:");
            num = scan.nextInt();

            if (num < 0)
                //true-branch
                System.out.println("The number " + num + " is negative");
            else
                //false-branch
                System.out.println("The number " + num + " is zero or positive");

            System.out.println("Good-bye for now");
        }
    }
}