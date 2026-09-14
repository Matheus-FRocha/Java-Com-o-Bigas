package br.edu.unicesumar.Ex4;

public class ContaPoupanca extends ContaBancaria{
    private double valorRendimento;
    public ContaPoupanca(Cliente titular){
        super(titular);

        valorRendimento = getSaldo() * 0.001;

        this.setSaldo(getSaldo() + valorRendimento);
    }

    @Override
    public void ExibirDadosConta(){
        super.ExibirDadosConta();
        System.out.printf("\nO valor do rendimento da conta poupança é de: %.2f", valorRendimento);
    }
}
