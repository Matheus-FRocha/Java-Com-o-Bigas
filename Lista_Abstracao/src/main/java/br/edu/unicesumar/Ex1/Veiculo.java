package br.edu.unicesumar.Ex1;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private double valorVeiculo;

    public Veiculo(String marca, String modelo, double valorVeiculo) {
        this.marca = marca;
        this.modelo = modelo;
        this.valorVeiculo = valorVeiculo;
    }

    public abstract double calcularSeguro();

    public abstract void exibirVeiculo();

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorVeiculo() {
        return valorVeiculo;
    }
}
