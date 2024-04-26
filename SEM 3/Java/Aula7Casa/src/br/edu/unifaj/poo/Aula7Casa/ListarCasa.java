package br.edu.unifaj.poo.Aula7Casa;

import java.util.Set;

public class ListarCasa {
    private GerenciadorDeCasas gerenciador;

    public ListarCasa(GerenciadorDeCasas gerenciador) {
        this.gerenciador = gerenciador;
    }

    public void listarCasas() {
        Set<Casa> casas = gerenciador.getCasas();
        if (casas.isEmpty()) {
            System.out.println("Nenhuma casa cadastrada.");
        } else {
            System.out.println("Casas cadastradas:");
            for (Casa casa : casas) {
                System.out.println(casa);
            }
        }
    }
}

