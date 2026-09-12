package br.edu.unicesumar.Ex2;

import java.util.Scanner;

public class Empresa {
    private String nome;
    private String cnpj;
    private Funcionario[] funcionarios;

    public Empresa() {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o nome da empresa: ");
        this.nome = scanner.nextLine();

        System.out.printf("Digite o CNPJ da empresa: ");
        this.cnpj = scanner.nextLine();
        
        funcionarios = new Funcionario[5];
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios[0] = funcionario;
    }
}