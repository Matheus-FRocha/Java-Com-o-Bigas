package br.edu.unicesumar.Ex2;

import java.util.Scanner;

public class Gerente extends Funcionario{
    private String setor;

    public Gerente(){
        super("gerente");

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o setor que o gerente é responsável: ");
        this.setor = scanner.nextLine();


    }

    /*por que override?
    porque ele indica que estou usando o metodo exibirdados da classe funcionario, porem sobreescrevendo os dados
    recebo o que está sendo digitado dentro da classe funcionario, e apenas adiciono o setor
     */
    @Override
    public void ExibirDados() {
        System.out.printf("Nome: %s | Salário: %.2f | Setor: %s%n", getNome(), getSalario(), setor);
    }
}
