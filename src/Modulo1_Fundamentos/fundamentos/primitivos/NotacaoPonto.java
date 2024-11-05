package Modulo1_Fundamentos.fundamentos.primitivos;

public class NotacaoPonto {

    public static void main(String[] args) {

        String s = "Bom dia X";
        s = s.replace("X", "Senhora")
                .toUpperCase()
                .concat("!!!");
//        s = s.toUpperCase();
//        s = s.concat(" !!!");
        System.out.println(s + " " + s.length());

        /*
        Tipos primitivos não são capazes de serem usados com a notação ponto '.'
         */
    }
}
