package br.edu.unicesumar;

public class Desenvolvedor extends Funcionario implements ControlePonto{
    private String linguagemPrincipal;

    public Desenvolvedor(String nome, String cpf, double salario, String linguagemPrincipal, String matricula) {
        super(nome, cpf, salario, matricula);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    @Override
    public double getBonus(){
        return getSalario() * 0.10;
    }

    @Override
    public void baterPonto(String matricula){
        if(matricula.equals(getMatricula())){
            System.out.printf("ponto batido");
        }else{
            System.out.printf("ihh, fala com o tebaldi");
        }
    }
}
