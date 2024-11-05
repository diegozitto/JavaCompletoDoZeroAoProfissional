package Modulo1_Fundamentos.fundamentos.primitivos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {
     double a = 1; // conversão implícita
        System.out.println(a);

     float b = (float) 1.12345678888; //conversão explícita ( cast )
        System.out.println(b);

     int c = 340;
     byte d = (byte) c;
        System.out.println(d);

     double e = 1.999999;
     int f = (int) e;
        System.out.println(f);
    }
}
