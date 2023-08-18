package com.interswitch;

import org.interswitch.Calculator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        while (true) {
            try {
                Calculator calculator = new Calculator();
                Scanner input = new Scanner(System.in);
                System.out.println("input first number: ");
                int a = input.nextInt();
                System.out.println("input second number: ");
                int b = input.nextInt();

                int choice = 0;
                System.out.println("""
                        Enter 1 to add the numbers
                        2 to subtract the numbers
                        3 to divide the numbers
                        4 to multiply the numbers
                        """);
                choice = input.nextInt();
                switch (choice) {
                    case 1 -> calculator.add(a, b);
                    case 2 -> calculator.sub(a, b);
                    case 3 -> calculator.div(a, b);
                    case 4 -> calculator.mult(a, b);
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            } catch (ArithmeticException e) {
                System.out.println("An arithmetic error occurred: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
}
