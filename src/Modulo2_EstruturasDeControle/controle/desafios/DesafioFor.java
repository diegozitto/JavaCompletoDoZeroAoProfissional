package Modulo2_EstruturasDeControle.controle.desafios;

public class DesafioFor {
    public static void main(String[] args) {

        String valor = "#";
//        for(int i = 1; i<=5; i++){
//            System.out.println(valor);
//            valor += "#";
//        }
        // NÃO PODE USAR VALOR NUMÉRICO PARA CONTROLAR O LAÇO
        // "int i = 1; i<=5; i++" usa numérico

        // NÃO CONSEGUI RESOLVER MAS APRENDI A TER UM NOVO OLHAR
        // e que dá para concatenar em "for"
        for(;!valor.equals("######");valor+="#"){
            System.out.println(valor);
        }

    }
}
