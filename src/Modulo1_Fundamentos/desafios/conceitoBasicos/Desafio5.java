package Modulo1_Fundamentos.desafios.conceitoBasicos;

import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        //Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
        Scanner leitor = new Scanner(System.in);

        String b, h;
        System.out.println("Vamos calcular a area de um triângulo");

        System.out.println("Digite o valor da sua base:");
        b = leitor.next().replace(",", ".");
        Double base = Double.parseDouble(b);

        System.out.println("Digite o valor da altura: ");
        h = leitor.next().replace(",", ".");
        Double altura = Double.parseDouble(h);

        Double area = (base * altura) / 2;

        System.out.println("Calculando...");
        System.out.println(base + " X " + altura + " / 2");
        System.out.println(base*altura + " /2");
        System.out.println("O valor da sua área é: " + area +" m²");

        leitor.close();
    }
}
