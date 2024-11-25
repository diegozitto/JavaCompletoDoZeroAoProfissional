package Modulo4_ArraysCollections.A1_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Aula3_Matriz {
    public static void main(String[] args) {
        // será utilizado o mesmo código do DesafioArray porém agora iremos armazenar as notas
        // de mais de um aluno [][]. O array externo armazenará a quantidade de alunos e o interno
        //  a quantidade  de notas de cada aluno, no final irá calcular a média da turma toda

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos?: ");
        int qntdAlunos = sc.nextInt();
        System.out.print("Quantas notas por aluno?: ");
        int qntdNotas  = sc.nextInt();

        double[][] notasDaTurma = new double[qntdAlunos][qntdNotas];
        double total = 0;

        for (int alunos = 0; alunos < notasDaTurma.length ; alunos++) {
            for (int notas = 0; notas < notasDaTurma[alunos].length ; notas++) {
                System.out.printf("Informe a nota %d do aluno %d\n",
                        (notas+1),(alunos+1));
                notasDaTurma[alunos][notas] = sc.nextDouble();
                total += notasDaTurma[alunos][notas];
            }            
        }

        double media = total/ (qntdAlunos * qntdNotas);
        System.out.println("Media da turma é: " + media);

        sc.close();

        for (double[] notasDoAluno: notasDaTurma){
            System.out.println(Arrays.toString(notasDoAluno));
        }
    }
}
