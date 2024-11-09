package Modulo2_EstruturasDeControle.controle.aulas;

import javax.swing.*;

public class Aula2_IfElse {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog(
                "Informe o número:");

        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0){
            System.out.println(numero + " é um número par!!");
        } else {
            System.out.println(numero + " é um número ímpar!!");
        }
    }
}
