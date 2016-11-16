package de.commsult.sgu.basics.conditional;


/*
 * A store wants a program that calculates the tax on an item of clothing. 
 * An item that costs $100 or more has a 5% tax. 
 * An item that costs less than $100 is tax free. 
 * Write a program that asks for a price, 
 * then calculates and prints the tax, 
 * then prints the total cost.
 */
class B_TaxProgram
{
  public static void main (String[] args) 
  {
    
    double price;
    double tax ;

    System.out.println("Enter the price:");

    if (  )

    else
      
    System.out.println("Item cost: " + price + " Tax: " + tax + " Total: " + (price+tax) );    
  }
}

tax = price * taxRate;          Scanner scan = new Scanner( System.in );
price = scan.nextDouble();      final double taxRate = 0.05;
price >= 100.0                  import java.util.Scanner;
tax = 0.0;