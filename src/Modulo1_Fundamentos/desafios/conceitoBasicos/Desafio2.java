package Modulo1_Fundamentos.desafios.conceitoBasicos;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        //Fº = C X 1,8 + 32
        Double celcius, fator, constante, fahrenheit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius para converter: ");
        celcius = sc.nextDouble();
        fator = 1.8D;
        constante = 32D;
        fahrenheit = (celcius * fator) + constante;
        System.out.println("F° = " + fahrenheit);
        sc.close();
    }
}
