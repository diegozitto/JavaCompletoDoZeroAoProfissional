package Modulo1_Fundamentos.fundamentos.primitivos;

public class PrimitivoVsObjeto {
    public static void main(String[] args) {
        //Objeto:
        String s = new String ("texto");
        s = s.toUpperCase();
        System.out.print(s);

        //Primitivo:
        int a = 123;
        System.out.print(a);

        //Objetos possuem "comportamentos" por padrão e primitivos não
        //Para que primitivos tenham comportamentos, utilizamos os WRAPPERS
        // Wrappers são a versão objeto dos tipos primitivos
    }
}
