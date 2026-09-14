package br.edu.unicesumar;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private String ra;
    private String cpf;

    public Aluno(){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o nome do aluno: ");
        this.nome = scanner.nextLine();

        System.out.printf("Digite o RA do aluno: ");
        this.ra = scanner.nextLine();

        System.out.printf("Digite o CPF do aluno: ");
        this.cpf = scanner.nextLine();
    }

    public void exibirDados(){
        System.out.printf("\nNome: %s | Ra: %s |CPF: %s", nome, ra, cpf);
    }
}
