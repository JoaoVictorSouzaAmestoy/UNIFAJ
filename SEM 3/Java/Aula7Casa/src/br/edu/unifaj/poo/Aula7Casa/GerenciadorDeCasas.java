package br.edu.unifaj.poo.Aula7Casa;

import java.util.HashSet;
import java.util.Set;

public class GerenciadorDeCasas {
    private Set<Casa> casas = new HashSet<>();

    public boolean adicionarCasa(Casa casa) {
        return casas.add(casa);
    }

    public Set<Casa> getCasas() {
        return new HashSet<>(casas);
    }
}

