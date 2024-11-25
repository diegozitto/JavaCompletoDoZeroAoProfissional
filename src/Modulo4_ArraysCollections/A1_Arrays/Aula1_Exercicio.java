package Modulo4_ArraysCollections.A1_Arrays;

import java.util.Arrays;

public class Aula1_Exercicio {
    public static void main(String[] args) {
        // [] pode ser posto antes ou depois do nome do Array mas nunca antes do tipo
        double[] notasAlunoA = new double[3];
        System.out.println(Arrays.toString(notasAlunoA));
        
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        System.out.println(Arrays.toString(notasAlunoA));
        
        // Para percorrer e imprimir cada dos valores do array, usa-se esse 'for' (embora não seja o mais indicado):
//        double total = 0;
//        for (int i = 0; i < 3; i++) {
//            total += notasAlunoA[i];
//            System.out.println(total);
//        }
//        System.out.println( total / 3);

        double total = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            total += notasAlunoA[i];
        }

        System.out.println( total / notasAlunoA.length);

        /*
        Outra forma de inicializar o array é já passando o valor de cada um dos seus elementos logo de cara:
         */
        double totalAlunoB = 0;
        double [] notasAlunoB = {6.9, 8.9, 5.5, 10};

        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];
        }

        System.out.println(totalAlunoB/ notasAlunoB.length);

    }
}
