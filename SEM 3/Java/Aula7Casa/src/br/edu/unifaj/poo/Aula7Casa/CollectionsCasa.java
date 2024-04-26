package br.edu.unifaj.poo.Aula7Casa;

import java.util.Scanner;

public class CollectionsCasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorDeCasas gerenciador = new GerenciadorDeCasas();
        CadastrarCasa cadastro = new CadastrarCasa(gerenciador);
        ListarCasa listagem = new ListarCasa(gerenciador);
        PesquisarCasa pesquisa = new PesquisarCasa(gerenciador);

        System.out.println("RA: 12326111");
        System.out.println("Nome: João Victor Souza Amestoy");
        System.out.println("Bem-vindo ao sistema de cadastro de casas!\n");

        while (true) {
            System.out.println("Digite 'sair' para encerrar, 'adicionar' para adicionar uma nova casa," +
                    " 'listar' para listar todas as casas ou 'pesquisar' para pesquisar uma casa:");
            String comando = scanner.nextLine();

            if ("sair".equalsIgnoreCase(comando)) {
                break;
            } else if ("adicionar".equalsIgnoreCase(comando)) {
                cadastro.adicionarCasa(scanner);
            } else if ("listar".equalsIgnoreCase(comando)) {
                listagem.listarCasas();
            } else if ("pesquisar".equalsIgnoreCase(comando)) {
                pesquisa.pesquisarCasaPorDono(scanner);
            } else {
                System.out.println("Comando inválido.");
            }
        }

        scanner.close();
    }
}
