package Modulo1_Fundamentos.fundamentos.operadores;

public class Aritmeticos {
    public static void main(String[] args) {
        System.out.println(2 + 3);

        var x = 34.56;
        double y = 2.2;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

        System.out.println("");

        int a = 8;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a / (double) b);
        System.out.println(a / (float) b);
        /*
        módulo é o operador aritmético que retorna o resto das operações:
        8 / 3 = 2.
         */
        System.out.println(a % b);
        System.out.println(8 % 3);
        /*
        Na procedência abaixo, a "multiplicação"  será feita primeiro
        Depos a adição e por último a substração
         */
        System.out.println(x + y - a * b);
    }
}
