package Modulo1_Fundamentos.fundamentos.primitivos;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {

        System.out.println("2" == "2");

        String s1 = new String("2");
        System.out.println("2" == s1);
        System.out.println("2".equals(s1));

        Scanner sc = new Scanner(System.in);

        String s2 = sc.nextLine();
        // next()     - método do Scanner que permite escrever a
        //              string e já elimina os espaços em  branco

        // nextLine() - método do Scanner que permite escrever a
        //              string do jeito que escreveu c/ ou s/ espaço

        System.out.println( "2" == s2.trim() );
        // trim()     - elimina os espaços em branco nas strings

        System.out.println( "2".equals( ( s2.trim() ) ) );

        sc.close();
    }
}