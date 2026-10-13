package br.edu.unicesumar.Ex5;

public class Mago extends Personagem{
    public Mago(String nome, String classe, String status, double vida, double dano, int nivel) {
        super(nome, classe, status, vida, dano, nivel);
    }

    @Override
    public void atacar(Personagem personagem){
        super.atacar(personagem);
        System.out.printf("O ataque utilizado foi a bola de fogo milenar");
    }

}
