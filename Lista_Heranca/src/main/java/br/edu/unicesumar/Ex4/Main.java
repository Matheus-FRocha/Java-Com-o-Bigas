package br.edu.unicesumar.Ex4;

public class Main {
    public static void main(String[] args) {

        Cliente matheus = new Cliente();
        ContaCorrente cmatheus = new ContaCorrente(matheus);
        matheus.ExibirDados();
        cmatheus.ExibirDadosConta();

        Cliente ligia = new Cliente();
        ContaPoupanca cligia = new ContaPoupanca(ligia);
        ligia.ExibirDados();
        cligia.ExibirDadosConta();
    }
}
