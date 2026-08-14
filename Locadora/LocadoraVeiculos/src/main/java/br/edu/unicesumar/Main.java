package br.edu.Unicesumar;

import br.edu.unicesumar.Veiculo;

public class Main {
    public static void main(String[] args) {

        Veiculo corsa = new Veiculo("GM", "Corsa", 2010);

        int qtdPortasDaClasse = corsa.getQtdPortas();

        System.out.printf("Quantidade de portas da classe %d", qtdPortasDaClasse);

        corsa.setQtdPortas(4);

        corsa.exibirDados();


        Veiculo BMW = new Veiculo("Sportline", "320I", 2026);

        BMW.setAnoFabricacao(1218);

        BMW.exibirDados();
    }
}