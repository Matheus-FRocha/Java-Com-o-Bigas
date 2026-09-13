package br.edu.unicesumar.Ex4;

public class ContaBancaria {
    private double saldo;
    private Cliente titular;

    public ContaBancaria(Pessoa titular){
        this.titular = titular;

        System.out.printf("Digite o saldo atual da conta do %s", titular.getNome());
    }
}
