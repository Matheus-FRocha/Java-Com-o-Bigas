package br.edu.unicesumar;

public class Gerente extends Funcionario implements ControlePonto{
    private String setorResponsavel;

    public Gerente(String nome, String cpf, double salario, String setorResponsavel, String matricula) {
        super(nome, cpf, salario, matricula);
        this.setorResponsavel = setorResponsavel;
    }

    @Override
    public double getBonus(){
        return getSalario() * 0.15;
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
