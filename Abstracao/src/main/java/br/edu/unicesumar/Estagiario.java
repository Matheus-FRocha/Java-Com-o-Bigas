package br.edu.unicesumar;

public class Estagiario extends Funcionario{
    public Estagiario(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double getBonus(){
        return getSalario() * 0.2;
    }

    @Override
    public void exibirDados(){
        System.out.printf("Nome: %s |  Cargo : %s | Salario: %.2f", getNome(), this.getClass(), getSalario());
    }
}
