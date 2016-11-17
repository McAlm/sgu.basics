package de.commsult.sgu.basics.conditional;

import java.util.Scanner;

/*
 * A store wants a program that calculates the tax on an item of clothing. 
 * An item that costs $100 or more has a 5% tax. 
 * An item that costs less than $100 is tax free. 
 * Write a program that asks for a price, 
 * then calculates and prints the tax, 
 * then prints the total cost.
 */
class B_TaxProgram {
    public static void main(String[] args) {

        double price;
        double tax;
        final double taxRate = 0.05;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the price:");
        price = scan.nextDouble();

        if (price >= 100.0) {
            tax = price * taxRate;
        }

        else {
            tax = 0.0;
        }

        System.out.println("Item cost: " + price + " Tax: " + tax + " Total: " + (price + tax));
    }
}
