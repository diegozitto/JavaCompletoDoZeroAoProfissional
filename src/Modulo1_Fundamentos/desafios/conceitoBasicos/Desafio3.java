package Modulo1_Fundamentos.desafios.conceitoBasicos;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        // Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
        // IMC = peso (kg) / altura² (m)
        Scanner sc = new Scanner(System.in);

        String altura, peso;

        System.out.println("Digite seu peso: ");
        peso = sc.nextLine().replace(",",".");
        double pesoKg = Double.parseDouble(peso);

        System.out.println("Digite sua altura: ");
        altura = sc.nextLine().replace(",",".");
        double alturaMetros = Double.parseDouble(altura);

        double imc = pesoKg / (alturaMetros*alturaMetros);
        sc.close();
        System.out.printf("Seu IMC é: %.2f", imc);
    }
}
