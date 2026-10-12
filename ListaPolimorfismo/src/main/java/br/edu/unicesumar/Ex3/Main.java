package br.edu.unicesumar.Ex3;

public class Main {
    public static void main(String[] args) {

        FormaGeometrica bobEsponja = new Quadrado(3.59);

        FormaGeometrica circulo = new Circulo(4.27);

        System.out.printf("total %.2f", bobEsponja.calcularArea());

        System.out.println();

        System.out.printf("total %.2f", circulo.calcularArea());
    }
}
