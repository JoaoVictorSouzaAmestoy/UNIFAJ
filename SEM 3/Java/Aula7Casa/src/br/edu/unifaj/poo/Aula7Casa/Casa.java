package br.edu.unifaj.poo.Aula7Casa;

public class Casa {
    private String dono;
    private int comodos;
    private float valor;
    private float tamanho;
    private String comentario;

    public Casa(String dono, int comodos, float valor,
                float tamanho, String comentario) {
        this.dono = dono;
        this.comodos = comodos;
        this.valor = valor;
        this.tamanho = tamanho;
        this.comentario = comentario;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Casa casa = (Casa) obj;
        return dono.equals(casa.dono);
    }

    @Override
    public int hashCode() {
        return dono.hashCode();
    }

    public String getDono() {
        return dono;
    }

    @Override
    public String toString() {
        return "Dono: " + dono +
                ", Comodos: " + comodos +
                ", Valor: " + valor +
                ", Tamanho: " + tamanho +
                ", Comentario: " + comentario;
    }
}
