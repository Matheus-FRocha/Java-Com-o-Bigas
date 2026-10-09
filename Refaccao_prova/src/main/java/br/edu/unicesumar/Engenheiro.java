package br.edu.unicesumar;

public class Engenheiro {
    private String nome;
    private String crea;

    public Engenheiro(String nome, String crea) {
        this.nome = nome;
        this.crea = crea;
    }

    public void inspecionarNave(NaveEspacial nave){
        System.out.printf("O engenheiro %s inspecionou a nave %s", this.nome, nave.getNome());
    }
}
