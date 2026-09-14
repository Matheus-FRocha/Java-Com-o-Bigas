package br.edu.unicesumar.Ex4;

import java.util.Scanner;

public class Cliente extends Pessoa{
    private double salario;

    public Cliente(){
        super();

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o salario do %s: ", getNome());
        this.salario = scanner.nextDouble();
    }

    public double getSalario() {
        return salario;
    }

    public void ExibirDados(){
        System.out.printf("\nNome: %s | Salário %.2f", getNome(), salario);
    }

}
