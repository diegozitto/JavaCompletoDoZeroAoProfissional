package Modulo2_EstruturasDeControle.controle.desafiosDoModulo;

import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        /*
            Criar um programa que receba um número e diga se ele é um número primo.
        */
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos saber se esse número é primo...");
        System.out.print("Digite o número: ");

        Integer numero = sc.nextInt();

        // Caso o número seja menor ou igual a 1, ele não é primo
        if (numero <= 1) {
            System.out.println("Não é primo");
        }
        // Caso o número seja 2 ou 3, ele é primo
        else if (numero == 2 || numero == 3) {
            System.out.println("É primo");
        } else {
            boolean primo = true;  // Assume-se que o número é primo

            // Verifica divisores até a raiz quadrada do número
            for (Integer divisor = 2; divisor <= Math.sqrt(numero); divisor++) {
                if (numero % divisor == 0) {
                    primo = false;  // Encontrou um divisor, não é primo
                    break;  // Interrompe o loop
                }
            }

            // Exibe o resultado com base no valor de 'primo'
            if (primo) {
                System.out.println("É primo");
            } else {
                System.out.println("Não é primo");
            }
        }

        sc.close();
    }
}
