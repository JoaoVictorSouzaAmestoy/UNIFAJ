package br.com.ceub;

import java.util.Scanner;

public class QuestaoOperadoresT {

    public static void main(String[] args) {

        double x = 1000.0;

        double y = x + (x>=1000 ? 100 : 500);

        System.out.println(y);

    }

}

