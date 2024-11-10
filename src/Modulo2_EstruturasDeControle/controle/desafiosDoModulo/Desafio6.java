package Modulo2_EstruturasDeControle.controle.desafiosDoModulo;

import java.util.Random;
import java.util.Scanner;

public class Desafio6 {
    public static void main(String[] args) {
        /*
        Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
        Armazene um numero aleatório em uma variável.
        O Jogador tem 10 tentativas para adivinhar o número gerado.
         Ao final de cada tentativa, imprima a quantidade de tentativas restantes, e imprima se
          o número inserido é maior ou menor do que o número armazenado.
        */

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int numero = random.nextInt(0,101) ;
        int resposta;

        int tentativas;
        for(tentativas = 1; tentativas<=10; tentativas++){
            System.out.println("Tente adivinhar o número: ");
            resposta = sc.nextInt();

            if(resposta < numero){
                System.out.println(resposta + " é menor que o número.");
            } else if (resposta > numero){
                System.out.println(resposta + " é maior que o número.");
            }else{
                System.out.println("Você acertou o número, PARABÉNS!!");
                break;
            }

            System.out.println("Tentativas feitas até agora: " + tentativas);
        }

        sc.close();
    }
}