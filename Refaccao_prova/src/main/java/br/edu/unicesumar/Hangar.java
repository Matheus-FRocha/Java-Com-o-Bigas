package br.edu.unicesumar;

public class Hangar {
    private String nome;
    private int capacidadeMaxima;
    private NaveEspacial[] naves;

    public Hangar(String nome, int capacidadeMaxima) {
        this.nome = nome;
        this.capacidadeMaxima = capacidadeMaxima;
        this.naves = new NaveEspacial[capacidadeMaxima];
    }

    public String getNome() {
        return nome;
    }

    public void addNave(NaveEspacial nave){
        if(capacidadeMaxima>0){
            capacidadeMaxima--;
            this.naves[capacidadeMaxima] = nave;
            nave.setHangar(this);
        }
    }
}
