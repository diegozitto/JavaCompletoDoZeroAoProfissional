package Modulo2_EstruturasDeControle.controle.aulas;

public class Aula13_BreakRotulado {
    public static void main(String[] args) {

        externo:
        for (int i = 0; i <= 3; i++) {
            for(int j = 0; j <= 3; j++){
                if (i == 1){
                    break externo;
                }
                System.out.printf(" i: [%d], j: [%d]\n ", i,j);
            }
        }



    }
}