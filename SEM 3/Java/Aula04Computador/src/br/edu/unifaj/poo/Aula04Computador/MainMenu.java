package br.edu.unifaj.poo.Aula04Computador;

import java.util.ArrayList;
import java.util.Scanner;

import static br.edu.unifaj.poo.Aula04Computador.CadastrarComputador.exibirInformacoesAluno;

public class MainMenu {
    public static void main(String[] args) {
        System.out.println("Iniciando o  Computador");
        menu();
        System.out.println("Encerrando o Computador");
    }

    private static void menu() {
        Scanner sc = new Scanner(System.in);
        CadastrarComputador cadastro = new CadastrarComputador();
        ArrayList<Computador> lista = new ArrayList<>();

        loopInfinito : while(true) {
            System.out.println("1 - Listar Computadores");
            System.out.println("2 - Criar Computadores ");
            System.out.println("3 - Incluir Computadores");
            System.out.println("4 - Atualizar Computadores");
            System.out.println("5 - Excluir Computadores");
            System.out.println("6 - Exibir Informações do aluno");
            System.out.println("7 - Sair");
            int opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    cadastro.listar(lista);
                    break;
                case 2:
                    CadastrarComputador.criar(lista, sc);
                    break;
                case 3:
                    cadastro.incluir(lista, sc);
                    break;
                case 4:
                    cadastro.atualizar(lista, sc);
                    break;
                case 5:
                    cadastro.excluir(lista, sc);
                    break;
                case 6:
                    exibirInformacoesAluno();
                    break;
                case 7:
                    if (sair(sc)) {
                        break loopInfinito;
                    }
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }
        sc.close();
    }

    private static boolean sair(Scanner sc) {
        System.out.println("Confirma sair? S/N");
        String confirmar = sc.nextLine();
        if ("S".equals(confirmar)) {
            return true;
        }
        return false;
    }
}