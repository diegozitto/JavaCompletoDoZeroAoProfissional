package Modulo1_Fundamentos.fundamentos.operadores;

public class Relacionais {
    public static void main(String[] args) {

        int a = 97;
        int b = 'a';
        System.out.println(a==b); // true
        System.out.println('\u0061'); // a
        // Toda letra carrega com sigo seu código
        // hexadecimal do unicode e a letra 'a' tem a posição 97

        System.out.println(3 > 4); // false
        System.out.println(3 >= 3); // true
        System.out.println(3 < 7); // true
        System.out.println(30<=7); // false
        System.out.println(30 != 7); // true

        double nota = 9.9;
        boolean bomComportamento = false;
        boolean passouPorMedia   = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        System.out.println("Tem desconto? " + temDesconto);
    }
}
