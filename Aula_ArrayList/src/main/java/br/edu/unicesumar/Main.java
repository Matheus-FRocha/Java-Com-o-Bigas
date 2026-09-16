package br.edu.unicesumar;

public class Main {
    public static void main(String[] args) {

        Aluno matheus = new Aluno("Matheus", "123");

        Aluno zepedro = new Aluno("zé pedro", "98764");

        Aluno antoninho = new Aluno("antoninho", "12321");

        Aluno joao = new Aluno("Joao carvalho", "1232132123");

        Aluno victor = new Aluno("victor tchola", "3123123");

        Turma esoft = new Turma("engenharia de soft");
        esoft.addDisciplina("Poo");
        esoft.addDisciplina("123123213");
        esoft.addDisciplina("43342432");

        esoft.addAluno(matheus);
        esoft.addAluno(zepedro);
        esoft.addAluno(antoninho);
        esoft.addAluno(joao);
        esoft.addAluno(victor);

        int tamanhoLista = esoft.getAlunos().size();

        System.out.printf("Turma: ", esoft.getNome());

        for(int i=0; i<tamanhoLista; i++){
            Aluno aluno = esoft.getAluno(i);

            System.out.printf("%d - %s \n", i+1, aluno.getNome());
        }
    }
}
