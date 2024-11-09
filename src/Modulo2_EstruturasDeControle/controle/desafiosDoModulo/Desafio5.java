package Modulo2_EstruturasDeControle.controle.desafiosDoModulo;

import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        /*
            Reescreva usando switch.
        */
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos saber se esse número é primo...");
        System.out.print("Digite o número: \n");
        Integer numero = sc.nextInt();

        switch (numero) {
            case 1:
            case -1:
            case 0:
                System.out.println("Não é primo");
                break;
            case 2:
            case 3:
                System.out.println("É primo");
                break;
            default:
                boolean primo = true;
                for (Integer divisor = 2; divisor <= Math.sqrt(numero); divisor++) {
                    if (numero % divisor == 0) {
                        primo = false;
                        break;
                    }
                }
                if (primo) {
                    System.out.println("É primo");
                } else {
                    System.out.println("Não é primo");
                }

        }


        sc.close();
    }
}
