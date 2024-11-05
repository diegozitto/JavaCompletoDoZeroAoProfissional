package Modulo1_Fundamentos.fundamentos.operadores;

public class Atribuicao {
    public static void main(String[] args) {
        int a = 3;
        int b = a;
        int c = a + b;
        System.out.println("C vale: " + c + " e se somar 3 fica: ");

        c += b; // c = c + b;
        System.out.println(c + " e se subtrair 3 fica: ");
        c -= a; // c = c - a;
        System.out.println(c + " e se multiplicar por 3 fica: ");
        c *= b; // c = c * b;
        System.out.println(c + " e se dividir por 3 fica: ");
        c /= a; // c = c / a;
        System.out.println(c + " e o resto da divisão por 2 fica: ");
        c %= 2; // c = c % 2; 0 (par) ou 1 (impar)
        System.out.println(c);
    }
}
