package Modulo3_Classes_E_Metodos.aulas;

public class Aula6_AreaCirc {
  double raio;
  double pi;

  Aula6_AreaCirc(double raioInicial){
    pi = 3.14;
    raio = raioInicial;
  }

  double area(){
    return pi * Math.pow(raio,2);
  }
    
  
}
