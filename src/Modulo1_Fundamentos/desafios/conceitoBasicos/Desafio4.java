package Modulo1_Fundamentos.desafios.conceitoBasicos;

import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        // Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
        Scanner sc = new Scanner(System.in);

        Double valor, quadrado, cubo;

        System.out.println("Digite o valor: ");
        valor = sc.nextDouble();

        quadrado = valor * valor;
        cubo = quadrado * valor;

        System.out.printf("Seu valor é: %.2f \n" + "O quadrado dele é: %.2f \n" + "O cubo dele é: %.2f", valor,quadrado,cubo);

        sc.close();
    }
}
