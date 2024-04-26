package br.edu.unifaj.poo.Aula04Computador;

public class Computador {
    int id;
    String CPU;
    String Memoria;
    String Armazenamento;
    String Tela;

    // Construtor padrão
    public Computador() {}

    // Construtor com todos os atributos
    public Computador(int id, String CPU, String Memoria, String Armazenamento, String Tela) {
        this.id = id;
        this.CPU = CPU;
        this.Memoria = Memoria;
        this.Armazenamento = Armazenamento;
        this.Tela = Tela;
    }
}
