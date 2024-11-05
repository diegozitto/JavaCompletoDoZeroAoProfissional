package Modulo1_Fundamentos.desafios.conceitoBasicos;

public class Desafio1 {
    public static void main(String[] args) {
        //(ºF - 32) x 5/9 = ºC

        double GrausCelcius,GrausFahrenheit;
        final double AJUSTE, FATOR;

        AJUSTE = 32;
        FATOR = 5.0/9.0;

        GrausFahrenheit = 212;

        GrausCelcius = (GrausFahrenheit - AJUSTE) * FATOR;

        System.out.println("A temperatura de ºF: " + GrausFahrenheit + " em ºC é: " + GrausCelcius);
    }
}
