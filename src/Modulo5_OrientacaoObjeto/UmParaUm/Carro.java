package Modulo5_OrientacaoObjeto.UmParaUm;

public class Carro {

    Motor motor = new Motor();
    // dessa forma dizemos que o carro tem um motor

    void acelerar(){
        if(motor.fatorInjecao < 2.6 ){ // acelerar 4 vezes
            motor.fatorInjecao += 0.4;
            //motor.fatorInjecao = motor.fatorInjecao + 0.4
            //motor.fatorInjecao = 1.4
        }
    }

    void frear(){
        if(motor.fatorInjecao > 0.5){
            motor.fatorInjecao -= 0.4;
             //motor.fatorInjecao = motor.fatorInjecao - 0.4
             //motor.fatorInjecao = 0.6
        }
    }

    void ligar(){
        motor.ligado = true;
    }

    void desligar(){
        motor.ligado = false;
    }

    boolean estaLigado(){
        return motor.ligado;
    }

}
