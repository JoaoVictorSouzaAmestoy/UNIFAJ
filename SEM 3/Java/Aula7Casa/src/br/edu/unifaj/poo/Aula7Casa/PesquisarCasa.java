package br.edu.unifaj.poo.Aula7Casa;

import java.util.Scanner;

public class PesquisarCasa {
    private GerenciadorDeCasas gerenciador;

    public PesquisarCasa(GerenciadorDeCasas gerenciador) {
        this.gerenciador = gerenciador;
    }

    public void pesquisarCasaPorDono(Scanner scanner) {
        System.out.println("Digite o nome do dono da casa que deseja pesquisar:");
        String nomeDono = scanner.nextLine();
        boolean encontrou = false;

        for (Casa casa : gerenciador.getCasas()) {
            if (casa.getDono().equalsIgnoreCase(nomeDono)) {
                System.out.println("Casa encontrada: " + casa);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma casa encontrada para o dono: " + nomeDono);
        }
    }
}


