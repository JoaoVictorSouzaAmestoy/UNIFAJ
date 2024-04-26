package br.edu.unifaj.poo.Aula04Computador;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastrarComputador {

    public static void listar(ArrayList<Computador> lista) {
        if (lista.isEmpty()) {
            System.out.println("Não há computadores cadastrados.");
            return;
        }
        for (Computador c : lista) {
            System.out.println("ID: " + c.id
                    + ", CPU: " + c.CPU
                    + ", Memória: " + c.Memoria
                    + ", Armazenamento: " + c.Armazenamento
                    + ", Tela: " + c.Tela);
        }
    }

    public static void criar(ArrayList<Computador> lista, Scanner sc) {
        System.out.println("Criar Computador:");
        Computador c = new Computador();
        System.out.print("Informe o ID: ");
        c.id = sc.nextInt();
        sc.nextLine();
        EntrarCpuMemoriaArmazenamentoTela(sc, c);
        lista.add(c);
        System.out.println("Computador criado com sucesso!");
    }

    private static void EntrarCpuMemoriaArmazenamentoTela(Scanner sc, Computador c) {
        System.out.print("Informe o CPU: ");
        c.CPU = sc.nextLine();
        System.out.print("Informe a Memória: ");
        c.Memoria = sc.nextLine();
        System.out.print("Informe o Armazenamento: ");
        c.Armazenamento = sc.nextLine();
        System.out.print("Informe a Tela: ");
        c.Tela = sc.nextLine();
    }

    public static void incluir(ArrayList<Computador> lista, Scanner sc) {
        if (lista.isEmpty()) {
            System.out.println("Não há computador para incluir. Por favor, crie um primeiro.");
            return;
        }
        System.out.println("Incluir Computador:");
        Computador modelo = lista.get(lista.size() - 1);
        Computador novoComputador = new Computador();
        System.out.print("Informe o ID do novo computador: ");
        novoComputador.id = sc.nextInt();
        sc.nextLine(); // Limpar buffer do teclado
        EntrarCpuMemoriaArmazenamentoTela(sc, novoComputador);
        lista.add(novoComputador);
        System.out.println("Computador incluído com sucesso!");
    }

    public static void atualizar(ArrayList<Computador> lista, Scanner sc) {
        System.out.println("Atualizar Computador:");
        System.out.print("Informe o ID do computador a ser atualizado: ");
        int id = sc.nextInt();
        sc.nextLine(); // Limpar buffer do teclado

        for (Computador c : lista) {
            if (c.id == id) {
                EntrarCpuMemoriaArmazenamentoTela(sc, c);
                System.out.println("Computador atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Computador com ID " + id + " não encontrado.");
    }

    public static void excluir(ArrayList<Computador> lista, Scanner sc) {
        System.out.println("Excluir Computador:");
        System.out.print("Informe o ID do computador a ser excluído: ");
        int id = sc.nextInt();
        sc.nextLine(); // Limpar buffer do teclado

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).id == id) {
                lista.remove(i);
                System.out.println("Computador excluído com sucesso!");
                return;
            }
        }
        System.out.println("Computador com ID " + id + " não encontrado.");
    }

    public static void exibirInformacoesAluno() {
        System.out.println("Nome do Aluno: João Victor Souza Amestoy ");
        System.out.println("RA: 12326111");
    }

}