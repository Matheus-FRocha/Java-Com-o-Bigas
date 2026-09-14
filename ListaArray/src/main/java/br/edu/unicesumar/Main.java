package br.edu.unicesumar;

public class Main {
    static void main() {

        Aluno matheus = new Aluno();

        Turma a = new Turma(matheus);
        a.exibirDados();
    }
}
