package Modulo2_EstruturasDeControle.controle.desafiosDoModulo;

import java.util.Random;
import java.util.Scanner;

public class Desafio7 {
    public static void main(String[] args) {
        /*
           Criar um programa que enquanto estiver recebendo números positivos, imprime no
           console a soma dos números inseridos, caso receba um número negativo, encerre o
           programa. Tente utilizar a estrutura do while.
        */

        Scanner sc = new Scanner(System.in);
        Double numero, soma;
        numero = 0.0;
        soma = 0.0;

        while (numero >= 0){
            System.out.println("Digite o número: ");
            numero = sc.nextDouble();
            if (numero < 0){
                System.out.println("Saindo da conta");
                System.out.printf("Soma: %.2f", soma);
                break;
            } else {
                soma = soma + numero;
            }
        }



        sc.close();
    }
}