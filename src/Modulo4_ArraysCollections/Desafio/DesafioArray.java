package Modulo4_ArraysCollections.Desafio;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        // calcular a media de notas de um aluno
        // Interação do usuário, "quantas notas quer informar?", criar um Array de 'x' posições para receber as notas
        // Quebrar o algoritmo em 2 laços 'For'
        // 1º laço: pegar e armazenar notas em um Array e armazenar no array
        // 2º laço: Em um ForEach deve percorre o array e armazenar os valore em uma variável soma e apresentar a media

        Scanner sc = new Scanner(System.in);
        double soma, media;
        int contador, i;
        soma = 0.0;

        System.out.println("Quantas notas gostaria de salvar?");
        i = sc.nextInt();
        Double notas[] = new Double[i];

        for (contador = 0; contador < i; contador++) {
            System.out.println("Informe a " + (contador + 1) + "º nota:");
            notas[contador] = sc.nextDouble();
        }

        for (double nota : notas) {
            soma += nota;
        }

        media = soma / i;

        System.out.println("Media: " + media);
    }
}
