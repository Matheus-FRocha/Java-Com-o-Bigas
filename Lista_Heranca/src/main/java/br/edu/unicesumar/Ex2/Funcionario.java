package br.edu.unicesumar.Ex2;

import java.util.Scanner;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String tipo){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o nome do %S: ", tipo);
        this.nome = scanner.nextLine();

        System.out.printf("Digite o salario do funcionário: ");
        this.salario = scanner.nextDouble();
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void ExibirDados(){
        System.out.printf("Nome: %s | Salário %.2f ", nome, salario);
    }
}
