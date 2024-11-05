package Modulo1_Fundamentos.fundamentos.primitivos;

public class TipoString {

    public static void main(String[] args) {

        String s = "Boa Tarde";
        System.out.println(s.concat(" !!!"));
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.startsWith("boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));

        /*
        Além do println (que já executa a quebra de linha '\n' automaticamente), existe
        também o printf (que utiliza as formatações para cada tipo primitivo) Veja a seguir:
         */
        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;
        System.out.printf("O senhor: %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario );
    }
}
