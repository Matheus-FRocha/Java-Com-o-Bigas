package br.edu.unicesumar.Ex1;

public class Main {
    public static void main(String[] args) {

        Moto bmw = new Moto("BMW", "S1000 RR");

        Carro volkswagen = new Carro("Volkswagen", "Jetta GLI");

        System.out.printf("O valor do pedágio para motos é %.2f", bmw.calcularPedagio());

        System.out.println();

        System.out.printf("O valor do pedágio para carros é %.2f", volkswagen.calcularPedagio());
    }
}
