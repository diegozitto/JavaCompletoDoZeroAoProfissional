package Modulo1_Fundamentos.fundamentos.operadores;

public class Logicos {
    public static void main(String[] args) {
        /*
        V && V = true qualquer coisa além é false
        V || F = true
        V ^  F = true
        !V     = false
        !F     = true
         */
        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && !condicao2);
        System.out.println(condicao1 || !condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!condicao1);
        System.out.println(!condicao2);

        /**
         *  AND retorna true quando ambos os booleans são true
         *      e false para o resto
         */
        System.out.print("\nTabela verdade E (AND):\n");
        System.out.println(true && true); //true
        System.out.println(true && false); //false
        System.out.println(false && true); //false
        System.out.println(false && false); //false

        /**
         *  OR retorna true quando um dos booleans é true
         *     e false quando ambos são false
         */
        System.out.print("\nTabela verdade OU (OR):\n");
        System.out.println(true  || true); //true
        System.out.println(true  || false); //true
        System.out.println(false || true); //true
        System.out.println(false || false); //false

        /**
         * XOR retorna true quando os booleans são diferentes
         *     e false quando são iguais
         */
        System.out.print("\nTabela verdade OU Exclusivo (XOR):\n");
        System.out.println(true ^ true); //false
        System.out.println(true ^ false); //true
        System.out.println(false ^ true); //true
        System.out.println(false ^ false); //false

        /**
         * NOT retorna o inverso do boolean
         */
        System.out.print("\nTabela verdade ! (NOT):\n");
        System.out.println(!true); //false
        System.out.println(!false); //true
    }
}
