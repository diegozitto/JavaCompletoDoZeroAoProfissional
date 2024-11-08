package Modulo2_EstruturasDeControle.controle.desafios;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        // Quero calcular a médias das notas de uma turma mas não sei quantos alunos tem.
        // Enquanto o usuário não digitar "-1", os valores devem ser armazenados em uma variável
        // e a média deve ser calculada e informada ao usuário

        Scanner sc = new Scanner(System.in);


        Double somaNotas = 0.0;
        Double media;
        Integer contador = 0;

        while (true) {
            System.out.println("\nDigite sua nota: ");
            Double valor = sc.nextDouble(); // notas


//            --------LÓGICA--------
            if (valor < 0 || valor > 10) {
                System.out.println("Nota inválida");

            } else {
                System.out.println("Nota registrada, digite a próxima ou encerre o cadastro de notas");
                somaNotas = somaNotas + valor;
                contador++;
                System.out.printf("Número de notas cadastradas: %d \n" +
                        "Soma das notas cadastradas: %.2f", contador, somaNotas);
            }

            if (contador <= 0) {
                System.out.println("Nenhuma nota foi registrada");
            }

            if (valor == -1) {
                break;
            }
        }

        media = somaNotas / contador;
        if((somaNotas + contador) == 0.0){
            System.out.println("Até logo, sua média é: 0");
        } else{
        System.out.println("Até logo, sua média é: " + media);
        }
        sc.close();

    }
}
