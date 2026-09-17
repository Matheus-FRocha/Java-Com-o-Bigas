package br.edu.unicesumar;

public class Main {
    public static void main(String[] args) {

        Comodo quarto = new Comodo();

        LampadaIot alexa = new LampadaIot(quarto);
        alexa.exibirDados();

        quarto.exibirDados();
        quarto.exibirDispositivos();
    }
}
