package br.edu.unicesumar;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);



        System.out.print("Digite o primeiro número: ");
        int num1 = leitor.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = leitor.nextInt();

        System.out.printf("Soma dos dois números %d", num1+num2);
    }
}
