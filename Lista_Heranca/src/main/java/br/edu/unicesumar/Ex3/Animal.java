package br.edu.unicesumar.Ex3;

import java.util.Scanner;

public class Animal {
    private String nome;
    private String raca;

    public Animal(){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o nome do animal: ");
        this.nome = scanner.nextLine();

        System.out.printf("Digite a raça do animal: ");
        this.raca = scanner.nextLine();
    }

    public void EmitirSom(){
        System.out.printf("Som animal");
    }

    public void ExibirDados(){
        System.out.printf("Nome: %s | Raca: %s", nome, raca);
    }

}
