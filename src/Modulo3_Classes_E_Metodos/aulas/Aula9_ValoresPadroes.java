package Modulo3_Classes_E_Metodos.aulas;

public class Aula9_ValoresPadroes {
    static int b;
    static String s;
    public static void main(String[] args) {
        // ao criar uma variável (independente de qual o tipo), haverá um valor padrão (quando nada for definido)
        // byte, short, int, long --> 0
        // float e double --> 0.0
        // boolean --> false
        // char --> '\u0000'
        // String --> null

//        int a;
//        System.out.println(a); // erro, pois variáveis locais não são inicializadas por padrão
        // por regra, as variáveis locais precisam ser inicializadas assim que criadas

        System.out.println(b); // certo pois a variável 'b' é static, logo pertence a classe e não a instância da mesma
        System.out.println(s);
    }
}
