package Modulo3_Classes_E_Metodos.aulas;

public class Aula6_AreaCircTeste {
    public static void main(String[] args){

            Aula6_AreaCirc a1 = new Aula6_AreaCirc(10.0);
           
            /*
            a1.pi = 10; Embora funcione ainda a alteração, não é a maneira correta de 
            acessar a variável Pi pois agora ela é um atributo de classe
           
            Aula6_AreaCirc.pi = 3.1415; //maneira correta antes do final
            */

            System.out.println("Área 1: " + a1.area());

        System.out.println("-----------------------------------------------");

            Aula6_AreaCirc a2 = new Aula6_AreaCirc(5);
            
            /*
            a2.pi = 5; Embora funcione ainda a alteração, não é a maneira correta de
            acessar a variável Pi pois agora ela é um atributo de classe 

            Aula6_AreaCirc.pi = 10; //maneira correta antes do final
            */ 
                        
            System.out.println("Área 2: " + a2.area());
        
        System.out.println("-----------------------------------------------");

            System.out.println("Meu PI: " + Aula6_AreaCirc.PI);
            System.out.println("Java PI: " + Math.PI);
    }
}
