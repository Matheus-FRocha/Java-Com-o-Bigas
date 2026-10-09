package br.edu.unicesumar.Ex2;

public class Cachorro extends Animal{
    public Cachorro(String raca, String idade, String nome) {
        super(raca, idade, nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("Au au!");
    }
}
