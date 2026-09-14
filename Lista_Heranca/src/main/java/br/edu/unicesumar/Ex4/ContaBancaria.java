package br.edu.unicesumar.Ex4;

import java.util.Scanner;

public class ContaBancaria {
    private double saldo;
    private String numeroConta;
    private String numeroAgencia;
    private Cliente titular;

    public ContaBancaria(Cliente titular){
        this.titular = titular;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o número da conta: ");
        this.numeroConta = scanner.nextLine();

        System.out.printf("Digite o número da agência: ");
        this.numeroAgencia = scanner.nextLine();

        System.out.printf("Digite o saldo atual da conta do %s: ", titular.getNome());
        this.saldo = scanner.nextDouble();
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ExibirDadosConta(){
        System.out.printf("\n----------Dados conta----------\n");
        System.out.printf("Nome titular: %s \nSaldo conta: %.2f \nNúmero conta: %s \nNúmero agência: %s", titular.getNome(), saldo, numeroConta, numeroAgencia);
    }
}
