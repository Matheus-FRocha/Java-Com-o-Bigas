package br.edu.unicesumar.Ex5;

public class Main {
    public static void main(String[] args) {

        Monstro orc = new Monstro("Orc", "Monstro ancestral" , "Vivo", 100, 38.7, 38);
        Personagem guerreiro = new Guerreiro("Arthur", "Cavaleiro da Verdade", "Vivo", 120.0, 25.0, 5);
        Personagem mago = new Mago("Merlin", "Mago arcano", "Vivo", 80.0, 35.0, 5);

        orc.exibirDados();
        guerreiro.exibirDados();
        mago.exibirDados();

        guerreiro.atacar(orc);


    }
}
