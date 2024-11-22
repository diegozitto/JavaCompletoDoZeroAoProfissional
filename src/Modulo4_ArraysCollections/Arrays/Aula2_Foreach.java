package Modulo4_ArraysCollections.Arrays;

public class Aula2_Foreach {
    public static void main(String[] args) {
        double[] notas = {9.9, 8.7, 7.2 , 9.4};

        // Para percorrer o array de forma que imprima elemento por elemento:
        // 1):

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i] + " i: " + i);
        }

        System.out.println();

        // 2) Lê-se: Para cada elemento dentro de 'notas[]' associe á variável 'nota' a cada
        // iteração e imprima 'nota'

        for(double nota: notas){
            System.out.println("nota: " + nota);
        }


    }
}
