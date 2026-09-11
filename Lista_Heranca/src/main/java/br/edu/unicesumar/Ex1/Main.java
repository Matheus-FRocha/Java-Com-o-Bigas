package br.edu.unicesumar.Ex1;

public class Main {
    public static void main(String[] args) {

        Carro jetta = new Carro("Volks", "GLI");
        jetta.ExibirDados();

        Carro virtus = new Carro("Volks", "TSI");
        virtus.ExibirDados();

        Moto hayabusa = new Moto("Suzuki", "Hayabusa");
        hayabusa.ExibirDados();
    }
}
