package br.edu.unicesumar.Ex4;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    public Pessoa(){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o nome: ");
        this.nome = scanner.nextLine();

        System.out.printf("\nDigite o CPF: ");
        this.cpf = scanner.nextLine();

        System.out.printf("\nDigite o Endereço: ");
        this.endereco = scanner.nextLine();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }
}
