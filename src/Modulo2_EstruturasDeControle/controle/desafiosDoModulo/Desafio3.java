package Modulo2_EstruturasDeControle.controle.desafiosDoModulo;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        /*
        3. Criar um programa que receba duas notas parciais, calcular a média final.
             Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", se a nota
            for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", caso
            contrário imprime no console "Reprovado".
         */

        Scanner sc = new Scanner(System.in);

        Double valor1, valor2, media;

        while (true) {
            System.out.println("Digite o valor da 1º nota: ");
            valor1 = sc.nextDouble();

            System.out.println("Digite o valor da 2º nota: ");
            valor2 = sc.nextDouble();

            if ((valor1 <= 10 && valor1 >= 0) && (valor2 <= 10 && valor2 >= 0)){
                System.out.println("valores válidos");
                break;
            } else {
                System.out.println("Valores inválidos");
            }
        }
                media = (valor1 + valor2) / 2;

        String resultado1, resultado2, resultado3;
        resultado1 = "Aprovado";
        resultado2 = "Recuperação";
        resultado3 = "Reprovado";

        if (media >= 7) {
            System.out.println(resultado1 + ", média: " + media);
        } else if (media < 7 && media > 4) {
            System.out.println(resultado2 + ", média: " + media);
        } else {
            System.out.println(resultado3 + ", média: " + media);
        }


        sc.close();
    }
}
