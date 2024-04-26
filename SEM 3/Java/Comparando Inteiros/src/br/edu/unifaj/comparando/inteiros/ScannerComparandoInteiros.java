package br.edu.unifaj.comparando.inteiros;

import java.util.Scanner;

public class ScannerComparandoInteiros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer:  ");
        int firstInteger = input.nextInt();

        System.out.println("Enter second integer: ");
        int secondInteger = input.nextInt();

        if (firstInteger > secondInteger) {
            System.out.printf("%d is larger. \n", firstInteger);
        } else if (secondInteger > firstInteger) {
            System.out.printf("%d is larger. \n", secondInteger);
        } else {
            System.out.println("These numbers are equal.");
        }
    }
}
