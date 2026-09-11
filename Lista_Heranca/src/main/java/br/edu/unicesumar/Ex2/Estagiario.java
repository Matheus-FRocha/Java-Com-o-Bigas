package br.edu.unicesumar.Ex2;

import java.util.Scanner;

public class Estagiario extends Funcionario{
    private int cargaHoraria;

    public Estagiario(){
        super("Estagiário");
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite a carga horária atual do estágiario: ");
        this.cargaHoraria = scanner.nextInt();
    }

    @Override
    public void ExibirDados() {
        System.out.printf("Nome: %s | Salário: %.2f | Carga Horaria: %d%n", getNome(), getSalario(), cargaHoraria);
    }
}
