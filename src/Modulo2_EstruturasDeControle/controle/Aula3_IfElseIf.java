package Modulo2_EstruturasDeControle.controle;

import java.util.Scanner;

public class Aula3_IfElseIf {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota: ");
        double nota = sc.nextDouble();

        if (nota > 10 || nota < 0){
            System.out.println("Nota inválida!!!");
        } else
            if(nota >= 8.1){
            System.out.println("Conceito A");
        } else
            if (nota>=6.1) {
            System.out.println("Conceito B");
        } else
            if (nota >= 4.1) {
            System.out.println("Conceito C");
        } else
            if(nota>= 2.1){
            System.out.println("Conceito D");
        } else {
            System.out.println("Conceito E");
        }

        sc.close();

    }
}
