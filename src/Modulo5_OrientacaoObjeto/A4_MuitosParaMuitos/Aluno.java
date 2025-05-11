package Modulo5_OrientacaoObjeto.A4_MuitosParaMuitos;

import java.util.ArrayList;

public class Aluno {

    final String nome;
    final ArrayList<Curso> cursos = new ArrayList<>();
    // ao adicionar o final em uma lista ela se torna uma lista constante
    // lista constante: significa que a variável 'cursos' não pode receber um novo endereço de memória
    // EX: não pode ocorrer --> cursos = new ArrayList <Curso>();

    Aluno (String nome){
        this.nome = nome;
    }

    void adicionarCurso(Curso curso){
        this.cursos.add(curso);     // O curso é adicionado à lista de cursos do aluno.
        curso.alunos.add(this);    // Este aluno é adicionado à lista de alunos do curso.

    }

    @Override
    public String toString() {
        return this.nome;
    }

}
