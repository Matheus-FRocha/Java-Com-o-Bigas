package br.edu.unicesumar.Ex1;

public class Carro extends Veiculo{
    public Carro(String marca, String modelo, double valorVeiculo) {
        super(marca, modelo, valorVeiculo);
    }

    @Override
    public double calcularSeguro(){return getValorVeiculo() * 0.35;}

    @Override
    public void exibirVeiculo(){
        System.out.printf("Marca: %s | Modelo: %s | Valor Veiculo: %.2f | O valor do seguro é :%.2f", getMarca(), getModelo(), getValorVeiculo(), calcularSeguro());
        System.out.println();
    }
}
