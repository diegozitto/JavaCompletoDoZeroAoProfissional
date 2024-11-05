package Modulo1_Fundamentos.desafios;

import java.util.Scanner;

public class DesafioLogicos {
    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)
        /*
        Se ambos forem V = TV 50 polegadas + sorvete (V V)
        Se apenas um for V = TV 32 polegadas + sorvete (V F) ou (F V)
        Se ambos forem F = Sem TV + Sem sorvete (F F)
         */
        Scanner sc = new Scanner(System.in);

        boolean terca,quinta;
        System.out.println("O trabalho de terça foi confirmado? (true ou false)");
        terca = sc.nextBoolean();

        System.out.println("O trabalho de quinta foi confirmado? (true ou false)");
        quinta = sc.nextBoolean();

        if(terca != quinta){
            System.out.println("A família comprou a TV de 32 polegadas e todos tomaram sorvete");
        } else if (terca == false && quinta == false) {
            System.out.println("Todos ficaram em casa e sem TV nova");
        } else {
            System.out.println("A família comprou a TV de 50 polegadas e todos tomaram sorvete");
        }
        sc.close();
    }
}
