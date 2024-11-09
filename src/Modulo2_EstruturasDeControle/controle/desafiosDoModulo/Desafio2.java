package Modulo2_EstruturasDeControle.controle.desafiosDoModulo;

import javax.swing.*;

public class Desafio2 {
    public static void main(String[] args) {
        //2. Criar um programa informa se o ano atual é um ano bissexto;
        //  Caso 1:
        //  ano divisível por 4 mas não por 100 nem 400 (resto igual 0)
        //  Caso 2:
        //  ano divisíel por 4, 100 e 400
        //  Valores teste (positivos): 2000, 2004, 2008, 2012, 2016, 2020, 2024

        String valor = JOptionPane.showInputDialog("Qual o ano?");
        Double ano = Double.parseDouble(valor);
        double div4,div100,div400;

        div4   = ano % 4;
        div100 = ano % 100;
        div400 = ano % 400;

        if (div4==0 && div100!=0){
            System.out.println("É um ano bissexto: " + ano +
                               "\n caso 1 ");
        } else if (div4==0 && div100==0 && div400==0) {
            System.out.println("É um ano bissexto: " + ano +
                               "\n caso 2");
        } else {
            System.out.println("Não é um ano bissexto: " + ano);

        }



    }
}
