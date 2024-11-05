package Modulo1_Fundamentos.fundamentos.primitivos;

import java.util.Date;

public class Import {
    public static void main(String[] args) {
    /*
    Existem funções no Java que estão disponíveis apenas por meio do IMPORT:
    Imagina que você é o Java e na família existem as api's (os parentes) que você
    pode chamar para sua casa (por meio do import). Por exemplo o Date (data) do java.util:

    Import sempre fora da classe
     */

        Date date = new Date();
        String nome = "Diego";

        System.out.println("Olá " + nome + ", hoje é: " + date);

    }
}
