package br.edu.unicesumar;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        System.out.println("Digite algo: ");
        Scanner leitor = new Scanner(System.in);

        int numeroDigitado  = leitor.nextInt();
        System.out.println(numeroDigitado);
    }
}