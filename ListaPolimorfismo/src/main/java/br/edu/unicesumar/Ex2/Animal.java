package br.edu.unicesumar.Ex2;

public class Animal {
    private String raca;
    private String idade;
    private String nome;

    public Animal(String raca, String idade, String nome) {
        this.raca = raca;
        this.idade = idade;
        this.nome = nome;
    }

    public void emitirSom(){
        System.out.println("som padrao rugido");
    }
}
