package br.edu.unicesumar.Ex5;

public class Monstro extends Personagem{
    public Monstro(String nome, String classe, String status, double vida, double dano, int nivel) {
        super(nome, classe, status, vida, dano, nivel);
    }

    @Override
    public void atacar(Personagem personagem){
        super.atacar(personagem);
        System.out.printf("O ataque utilizado foi o arranhão do monstro");
    }
}
