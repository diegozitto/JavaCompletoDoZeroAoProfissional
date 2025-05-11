package Modulo5_OrientacaoObjeto.A2_UmParaUm;

public class Teste_A2 {

    public static void main (String[] args){

        Carro c1 = new Carro();
        System.out.println("Ligado: " + c1.estaLigado());

        c1.ligar();
        System.out.println("Ligado: " + c1.estaLigado());

        System.out.println("RPM: " + c1.motor.giros());

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println("RPM: " + c1.motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        System.out.println("RPM: " + c1.motor.giros());

        c1.frear();
        c1.frear();

        // Faltou encapsulamento
        // c1.motor.fatorInjecao = -30;
        System.out.println("RPM: " + c1.motor.giros());

        c1.desligar();
        System.out.println("RPM: " + c1.motor.giros());

    }

}