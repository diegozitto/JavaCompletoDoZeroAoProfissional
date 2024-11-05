package Modulo1_Fundamentos.fundamentos.primitivos;

public class ConversaoNumeroString {
    public static void main(String[] args) {
        Integer num1 = 10000;
        System.out.println("Número de caracteres do wrapper 'Integer num1 = 10000' :" + num1.toString().length());

        int num2 = 10000;
        System.out.println("Tipo primitivo em String chamando o Integer.toString: " + Integer.toString(num2));
    }
}
