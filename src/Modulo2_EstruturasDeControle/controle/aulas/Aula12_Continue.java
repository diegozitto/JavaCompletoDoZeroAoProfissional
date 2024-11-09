package Modulo2_EstruturasDeControle.controle.aulas;

public class Aula12_Continue {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            if(i%2 == 1){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Fim!");
        // A principal diferença do break pro continue

        // Break: interrompe a execução e faz com que
        //        termine naque ponto (independente se ainda teria outros loops)

        //Continue: interrompe aquela execução específica mas mantém o resto
        // no exemplo acima é interpretado da seguint maneira:
        // Se o resto de 'i' por 2 for 1 (ímpar), não imprima mas contiue o loop
        // mas caso não seja, imprima o valor

        // Com o break ele terminaria o loop no primeiro ímpar que encontrasse

    }
}
