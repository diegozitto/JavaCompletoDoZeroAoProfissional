package Modulo1_Fundamentos.desafios.conceitoBasicos;

public class Desafio6 {
    public static void main(String[] args) {
        //  Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara.
        //  Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
        Double delta;
        System.out.println("Vamos achar o delta da expressão: 1x² + 12x + (-13) = 0");
        delta = (12.0 * 12.0) - (4.0 * 1.0 * (-13.0));
        System.out.println("Delta é: " + delta);


    }
}
