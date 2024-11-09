package Modulo2_EstruturasDeControle.controle.aulas;

import java.util.Scanner;

public class Aula1_if {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a média:");
        Double media = sc.nextDouble();

        if (media >= 7.0 && media <= 12) {
            System.out.println("Você passou!");
            System.out.println("Parabéns");
        }else {
            System.out.println("Que vergonha, estude mais.");
        }

        sc.close();
    }
}
