package Modulo2_EstruturasDeControle.controle.desafiosDoModulo;

import java.util.Scanner;

public class Desafio8 {
    public static void main(String[] args) {
        /*
           Crie um programa que recebe 10 valores e ao final imprima o maior número.
        */
        Scanner sc = new Scanner(System.in);

        Double numero, maiorValor;
        Integer contador;

        numero = 0.0;
        maiorValor = Double.MIN_VALUE;

        for (contador = 1; contador <= 10; contador++){
            System.out.println("Digite o número: ");
            numero = sc.nextDouble();
            if (numero > maiorValor){
                maiorValor = numero;
            }
            System.out.printf("Contador: %d\n", contador);
        }
        System.out.println("Maior número digitado foi: " + maiorValor);



        sc.close();
    }
}