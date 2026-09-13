package br.edu.unicesumar.Ex4;

public class Cliente extends Pessoa{
    private double salario;

    public Cliente(){
        super();

        System.out.printf("Digite o salario do %s", getNome());
    }
}
