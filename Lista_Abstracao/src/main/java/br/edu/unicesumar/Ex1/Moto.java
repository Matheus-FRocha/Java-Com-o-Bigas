package br.edu.unicesumar.Ex1;

public class Moto extends Veiculo{
    public Moto(String marca, String modelo, double valorVeiculo) {
        super(marca, modelo, valorVeiculo);
    }

    @Override
    public double calcularSeguro(){
        return getValorVeiculo()*0.25;
    }

    @Override
    public void exibirVeiculo(){
        System.out.printf("Marca: %s | Modelo: %s | Valor Veiculo: %.2f | O valor do seguro é :%.2f", getMarca(), getModelo(), getValorVeiculo(), calcularSeguro());
        System.out.println();
    }
}
