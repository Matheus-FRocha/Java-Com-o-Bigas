package br.edu.unicesumar.Ex4;

public class ContaCorrente extends ContaBancaria{
    private double limiteCredito;

    public ContaCorrente(Cliente titular){
        super(titular);

        limiteCredito = titular.getSalario() +1500;
    }

    @Override
    public void ExibirDadosConta(){
        super.ExibirDadosConta();
        System.out.printf("\nO limite de crédito é: %.2f", limiteCredito);
    }
}
