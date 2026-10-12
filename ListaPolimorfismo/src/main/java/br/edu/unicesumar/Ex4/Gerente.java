package br.edu.unicesumar.Ex4;



public class Gerente extends Funcionario{
    private static final int QTD_DIAS=37;
    public Gerente(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public double calcularFerias(){
        return (getSalario()/30) *QTD_DIAS;
    }

    @Override
    public void exibirDados(){
        System.out.printf("Nome Gerente: %s | Idade: %d | Salário: %.2f | Valor férias: %.2f", getNome(), getIdade(), getSalario(), calcularFerias());
    }
}
