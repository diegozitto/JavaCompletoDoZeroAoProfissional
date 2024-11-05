package Modulo1_Fundamentos.desafios;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        //Ler num 1
        //Ler num 2
        // + - * / %, dependo do operador que o usuário escolher deve realizar aquela operação

        Scanner sc = new Scanner(System.in);
        Double num1, num2;

        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextDouble();
        System.out.println("Digite o secundo número: ");
        num2 = sc.nextDouble();
        //-------------------LÓGICA CALCULADORA-------------------
        System.out.println("Digite um dos operadores desejados (+ - * / %): ");
        String operador = sc.next();

        double resultado;
        resultado = "+".equals(operador) ? num1 + num2 : 0;
        resultado = "-".equals(operador) ? num1 - num2 : resultado;
        resultado = "*".equals(operador) ? num1 * num2 : resultado;
        resultado = "/".equals(operador) ? num1 / num2 : resultado;
        resultado = "%".equals(operador) ? num1 % num2 : resultado;

        System.out.println(num1 + " " +  operador + " "  + num2 + " = " + resultado);
        sc.close();
    }
}
