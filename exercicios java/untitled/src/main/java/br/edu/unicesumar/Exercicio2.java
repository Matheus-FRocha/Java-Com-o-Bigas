package br.edu.unicesumar;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){

        System.out.printf("Digite seu nome: ");
        Scanner leitor = new Scanner(System.in);

        String nome = leitor.nextLine();

        System.out.printf("Bem vindo %s", nome);
    }

}
