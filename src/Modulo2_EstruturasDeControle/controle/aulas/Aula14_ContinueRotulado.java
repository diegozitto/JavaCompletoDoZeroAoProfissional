package Modulo2_EstruturasDeControle.controle.aulas;

public class Aula14_ContinueRotulado {
    public static void main(String[] args) {

        externo:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (i == 1) {
                    continue externo;
                }
                System.out.printf(" i: [%d], j: [%d] ", i, j);
            }
            System.out.println();
        }


    }
}