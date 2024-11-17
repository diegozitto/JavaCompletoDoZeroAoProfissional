package Modulo3_Classes_E_Metodos.desafiosDoModulo;

public class Jantar {
    public static void main(String[] args) {
       Pessoa p1 = new Pessoa("Arthur", 80);
        System.out.println(p1.apresentar());

        System.out.println( p1.comer(new Comida("Lasanha" ,2.0))  );
        System.out.println( p1.comer(new Comida("Feijoada",0.25)) );
        System.out.println( p1.comer(new Comida("sorvete" ,0.5))  );

        System.out.println(p1.apresentar());

    }
}

/*
 Solução professor:
        Adotou a abordagem de instanciar e criar uma comida diferente para ser consumida:

        Comida c1 = new Comida ( "Arroz" , 0.180 );
        Comida c2 = new Comida ( "Feijao" , 0.300 );
 */
