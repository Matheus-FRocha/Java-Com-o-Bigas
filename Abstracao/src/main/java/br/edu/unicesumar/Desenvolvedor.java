package br.edu.unicesumar;

public class Desenvolvedor extends Funcionario{
    private String linguagemPrincipal;

    public Desenvolvedor(String nome, String cpf, double salario, String linguagemPrincipal) {
        super(nome, cpf, salario);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    @Override
    public double getBonus(){
        return this.getSalario() * 0.10;
    }

    @Override
    public void exibirDados(){
        System.out.printf("Nome: %s |  Cargo : %s | Salario: %.2f", getNome(), this.getClass().getSimpleName(), getSalario());
    }
}
