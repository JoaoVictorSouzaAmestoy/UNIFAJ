package br.edu.unifaj.aritmetica;

import  java.util.Scanner;

public class ExampleScannerArithmetic {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter first integer: ");
    int firstNumber = input.nextInt();

    System.out.println("Enter the second integer: ");
    int secondNumber = input.nextInt();

    int sum = firstNumber + secondNumber;
    int product = firstNumber * secondNumber;
    int difference = firstNumber - secondNumber;
    int quotient = firstNumber / secondNumber;

    System.out.printf("Sum: %d\n", sum);
    System.out.printf("Product: %d\n", product);
    System.out.printf("Difference: %d\n", difference);
    System.out.printf("Quotient: %d\n", quotient);

    }
}
