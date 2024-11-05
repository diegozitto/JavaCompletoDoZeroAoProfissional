package Modulo1_Fundamentos.fundamentos.primitivos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.printf("%s %s tem %d anos.",
                       nome , sobrenome, idade);
        sc.close();

    }
}