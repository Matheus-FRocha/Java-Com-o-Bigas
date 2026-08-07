package br.edu.unicesumar;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        float soma=0;
        for(int i=0; i<3; i++){
            System.out.printf("Digite a %d nota: ", i+1);
            float nota = leitor.nextFloat();

            soma = soma + nota;
        }
        System.out.printf("A media do aluno é de %.2f", soma/3);
    }
}
