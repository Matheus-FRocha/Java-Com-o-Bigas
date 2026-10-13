package br.edu.unicesumar.Ex5;

public class Guerreiro extends Personagem{
    public Guerreiro(String nome, String classe, String status, double vida, double dano, int nivel) {
        super(nome, classe, status, vida, dano, nivel);
    }


    @Override
    public void atacar(Personagem personagem){
        super.atacar(personagem);
        System.out.printf("O ataque utilizado foi uma espadada com a espada da verdade");
    }
}
