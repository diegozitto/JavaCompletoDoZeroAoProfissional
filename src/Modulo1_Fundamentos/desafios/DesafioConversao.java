package Modulo1_Fundamentos.desafios;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
    /**
     * Criar um Scanner e 3 strings usando next ou nextLine
     * As string irão receber os últimos 3 salários de um funcionário
     * OBJETIVO:
     *  Calcular a média dos últimos 3 salários de uma pessoa
     *
     *  Nota: a separação das casas decimais deve poder ser feita tanto por vírgula quanto por ponto
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(new Locale("en", "US"));

        String salario1, salario2, salario3;
        System.out.println("Por favor, insira seus três últimos salários: ");

        System.out.println("Salario 1: ");
        salario1 = sc.nextLine().replace(",",".");
        Double s1 = Double.parseDouble(salario1);

        System.out.println("Salario 2: ");
        salario2 = sc.nextLine().replace(",",".");
        Double s2 = Double.parseDouble(salario2);

        System.out.println("Salario 3: ");
        salario3 = sc.nextLine().replace(",",".");
        Double s3 = Double.parseDouble(salario3);


        Double media = (s1 + s2 + s3) / 3;

        System.out.printf("Media dos seus 3 últimos salários é: R$ %.2f", media);

        sc.close();
    }

    //Obs: esqueci do replace para poder dar maior liberdade ao usuário, vivendo e aprendendo

}
