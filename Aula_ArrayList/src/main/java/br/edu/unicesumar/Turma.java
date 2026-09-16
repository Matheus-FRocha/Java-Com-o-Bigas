package br.edu.unicesumar;

import java.util.ArrayList;

public class Turma {
    private String nome;
    private ArrayList<Aluno> alunos;
    private ArrayList<String> disciplina;

    public Turma(String nome){
        this.nome = nome;
        this.disciplina = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void addAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public void addDisciplina(String disciplina){
        this.disciplina.add(disciplina);
    }

    public void removeAluno(int index){
        this.alunos.remove(index);
    }

    public Aluno getAluno(int index){
        return this.alunos.get(index);
    }

    public String getNome() {
        return nome;
    }
}
