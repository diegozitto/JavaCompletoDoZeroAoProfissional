package Modulo1_Fundamentos.fundamentos.primitivos;

import javax.swing.*;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo valor");
        System.out.println("Valor 1: " + valor1 + "\n" +
                           "Valor 2: " + valor2);

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);
        double soma    = numero1 + numero2;
        double media   = soma/2;

        System.out.println("Soma:" + soma);
    }
}
