package Modulo2_EstruturasDeControle.controle.desafios;

import java.util.Scanner;

public class DesafioWhileIndeterminado {
    public static void main(String[] args) {
        // Enquanto o usuário não digitar a palavra "sair", o laço de repetição
        // deve continuar:

        Scanner sc = new Scanner (System.in);

        String palavraDeSegurança = "";


            while (!palavraDeSegurança.equalsIgnoreCase("sair")) {
                System.out.println("Digite a palavra de segurança: ");
                palavraDeSegurança = sc.next();
            }

        sc.close();
    }
}
