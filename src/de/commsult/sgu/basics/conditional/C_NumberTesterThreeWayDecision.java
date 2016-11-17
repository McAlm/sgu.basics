package de.commsult.sgu.basics.conditional;

import java.util.Scanner;

class C_NumberTesterThreeWayDecision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Enter an integer:");
        num = scan.nextInt();

        if (num < 0) {
            // true-branch
            System.out.println("The number " + num + " is negative");

        } else {
            if (num > 0) {
                // nested true-branch
                System.out.println("The number " + num + " is positive");
            } else {
                // nested false-branch
                System.out.println("The number " + num + " is zero");
            }

        }

        System.out.println("Good-bye for now"); // always executed
    }
}