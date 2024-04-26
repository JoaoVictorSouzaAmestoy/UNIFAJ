package br.edu.unifaj.poo.Aula7Casa;

import java.util.Scanner;

public class CadastrarCasa {
    private GerenciadorDeCasas gerenciador;

    public CadastrarCasa(GerenciadorDeCasas gerenciador) {
        this.gerenciador = gerenciador;
    }

    public void adicionarCasa(Scanner scanner) {
        System.out.println("Nome do Dono:");
        String dono = scanner.nextLine();
        System.out.println("Número de Cômodos:");
        int comodos = Integer.parseInt(scanner.nextLine());
        System.out.println("Valor:");
        float valor = Float.parseFloat(scanner.nextLine());
        System.out.println("Tamanho:");
        float tamanho = Float.parseFloat(scanner.nextLine());
        System.out.println("Comentário:");
        String comentario = scanner.nextLine();

        Casa novaCasa = new Casa(dono, comodos, valor, tamanho, comentario);
        if (gerenciador.adicionarCasa(novaCasa)) {
            System.out.println("Casa adicionada com sucesso.");
        } else {
            System.out.println("Uma casa com esse dono já foi cadastrada.");
        }
    }
}
