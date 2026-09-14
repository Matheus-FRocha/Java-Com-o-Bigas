package br.edu.unicesumar;

import java.util.Scanner;

public class Turma {
    private String sala;
    private Aluno[] alunos;
    private int proximaPosicaoLivre;

    public Turma(){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o nome da sala: ");
        this.sala = scanner.nextLine();

        alunos = new Aluno[10];
        proximaPosicaoLivre = 0;
    }

    public void exibirDados(){
        System.out.printf("Sala: %s", sala);
        for (int i = 0;i<10;i++){
            if (alunos[i] != null) {
                System.out.printf("Aluno %d", i + 1);
                System.out.println("----------------\n");
                alunos[i].exibirDados();
            }
        }
    }

    public void addAluno(Aluno aluno){
        if (this.proximaPosicaoLivre >= 10){
            System.out.println("Limite de alunos Atingido");

        }else{
            this.alunos[this.proximaPosicaoLivre] = aluno;
            this.proximaPosicaoLivre++;
        }
    }
}
