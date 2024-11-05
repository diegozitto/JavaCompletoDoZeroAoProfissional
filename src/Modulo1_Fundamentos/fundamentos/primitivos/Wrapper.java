package Modulo1_Fundamentos.fundamentos.primitivos;

public class Wrapper {
    public static void main(String[] args) {
        Byte b = 100;
        Short s = 1000;
        //i = Integer.parseInt("10000");
        Integer i = 10000;
        Long l = 100000L;
        /*
        Long = classe
        long = tipo primitivo
         */
        System.out.println(b + " Byte\n" + s + " Short\n" + i + " Integer\n" + l + "L Long");

        Float f = 123.0F;
        System.out.println(f);

        Double d = 2345.5;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");

        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#';

    }
}
