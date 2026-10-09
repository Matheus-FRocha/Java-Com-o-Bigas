package br.edu.unicesumar.Ex2;

public class Gato extends Animal{
    public Gato(String raca, String idade, String nome) {
        super(raca, idade, nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("Miau Miau!");
    }
}
