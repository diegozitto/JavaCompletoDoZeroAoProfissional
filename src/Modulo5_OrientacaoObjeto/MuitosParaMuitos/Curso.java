package Modulo5_OrientacaoObjeto.MuitosParaMuitos;

import java.util.ArrayList;

public class Curso  {

    final String nome;
    final ArrayList<Aluno> alunos = new ArrayList<>();
    // ao adicionar o final em uma lista ela se torna uma lista constante
    // lista constante: significa que a variável 'alunos' não pode receber um novo endereço de memória
    // EX: não pode ocorrer --> alunos = new ArrayList <Aluno>();

    Curso (String nome){
        this.nome = nome;
    }

    void adicionarAluno(Aluno aluno){
       this.alunos.add(aluno);     // O aluno é adicionado à lista de alunos do curso.
        aluno.cursos.add(this);    // Este curso é adicionado à lista de cursos do aluno.

    }

    @Override
    public String toString() {
        return this.nome;
    }

}
