package Modulo3_Classes_E_Metodos.aulas;

public class Aula6_AreaCirc {
  double raio;
  final static double PI = 3.14; 
  /* 
   adicionando o modificado final (antes ou depois do static) faz com que o valor de Pi
   não possa ser alterado fora da classe de origem.

   Por convensão o nome da variável fica em maiúsculo
  */ 

  Aula6_AreaCirc(double raioInicial){
    raio = raioInicial;
  }

  double area(){
    System.out.println("Pi: " + PI +
                       "\nRaio: " + raio +
                       "\nÁrea: pi * raio²");
    return PI * Math.pow(raio,2);
  }
    
  
}
