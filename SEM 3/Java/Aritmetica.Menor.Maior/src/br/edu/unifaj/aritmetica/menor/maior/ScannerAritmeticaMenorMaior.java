package br.edu.unifaj.aritmetica.menor.maior;

import java.util.Scanner;

public class ScannerAritmeticaMenorMaior {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int first = input.nextInt();

        System.out.println("Enter second integer: ");
        int second = input.nextInt();

        System.out.println("Enter third integer: ");
        int third = input.nextInt();

        int sum = first + second + third;
        int average = sum/ 3;
        int product = first * second * third;
        int smallest = Math.min(first, Math.min(second, third));
        int largest = Math.max(first, Math.max(second, third ));

        System.out.printf("Sum: %d\n", sum);
        System.out.printf("Average: %d\n", average);
        System.out.printf("Product: %d\n", product);
        System.out.printf("Smallest: %d\n", smallest);
        System.out.printf("Largest: %d\n", largest);
    }
}
