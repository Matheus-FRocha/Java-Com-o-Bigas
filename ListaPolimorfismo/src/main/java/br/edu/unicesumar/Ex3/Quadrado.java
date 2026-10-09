package br.edu.unicesumar.Ex3;

public class Quadrado extends FormaGeometrica {

    public Quadrado(double raio) {
        super(raio);
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
