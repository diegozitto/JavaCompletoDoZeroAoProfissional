package Modulo2_EstruturasDeControle.controle.aulas;

import java.util.Scanner;

public class Aula6_DoWhille{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String valor = "";

        do {
            System.out.println("Você precisa falar as palavras mágias...");
            System.out.println("Quer sair? ");
            valor = sc.nextLine();
        } while(!valor.equalsIgnoreCase("Por favor"));

        System.out.println("Obrigado!!");
        sc.close();

    }
}
