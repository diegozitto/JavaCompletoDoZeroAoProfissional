package Modulo2_EstruturasDeControle.controle.desafios;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        //  Input  -> Output
        // Domingo -> 1
        // Segunda -> 2
        // Terça   -> 3
        // Quarta  -> 4
        // Quinta  -> 5
        // Sexta   -> 6
        // Sábado  -> 7
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o dia da semana: ");
        String diaDaSemana = leitor.nextLine().replace("á","a").replace("ç","c");

        if (diaDaSemana.equalsIgnoreCase("Domingo")){
            System.out.println("1");
        } else if (diaDaSemana.equalsIgnoreCase("Segunda")){
            System.out.println("2");
        } else if (diaDaSemana.equalsIgnoreCase("Terça")){
            System.out.println("3");
        } else if (diaDaSemana.equalsIgnoreCase("Quarta")){
            System.out.println("4");
        } else if (diaDaSemana.equalsIgnoreCase("Quinta")){
            System.out.println("5");
        } else if (diaDaSemana.equalsIgnoreCase("Sexta")){
            System.out.println("6");
        } else if (diaDaSemana.equalsIgnoreCase("Sabado")){
            System.out.println("7");
        } else {
            System.out.printf("Este dia ' %s ' não existe.", diaDaSemana);
        }


        leitor.close();
    }
}
