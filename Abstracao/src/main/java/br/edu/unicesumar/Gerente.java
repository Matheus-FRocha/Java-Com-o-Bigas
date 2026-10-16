package br.edu.unicesumar;

public class Gerente extends Funcionario{
    private String setor;

    public Gerente(String nome, String cpf, double salario, String setor) {
        super(nome, cpf, salario);
        this.setor = setor;
    }

    @Override
    public double getBonus(){
        return getSalario() * 0.15;
    }

    @Override
    public void exibirDados(){
        System.out.printf("Nome: %s |  Cargo : %s | Salario: %.2f", getNome(), this.getClass(), getSalario());
    }
}
