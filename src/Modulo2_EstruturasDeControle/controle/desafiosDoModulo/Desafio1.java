package Modulo2_EstruturasDeControle.controle.desafiosDoModulo;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        //1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e se é par;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número entre 0 e 10:");
        Integer numero = sc.nextInt();

        if (numero >= 0 && numero <= 10) {
            System.out.println("Número válido!!");

            if (numero % 2 == 0) {
                System.out.println("número: " + numero + " é par");
            } else {
                System.out.println("número: " + numero + " é ímpar");
            }

        } else {
            System.out.println("Número inválido!!");
        }

        sc.close();
    }
}
