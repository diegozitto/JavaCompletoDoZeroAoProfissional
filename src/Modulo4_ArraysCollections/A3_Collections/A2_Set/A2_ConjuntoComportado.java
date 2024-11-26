package Modulo4_ArraysCollections.A3_Collections.A2_Set;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class A2_ConjuntoComportado {

    public static void main(String[] args) {

        Set<String> listaAprovados = new HashSet<>(); // estou dizendo que 'lista' obrigatoriamente será do tipo String
//        lista.add(1.2); // erro de compilação pois o tipo String foi definido como padrão para 'lista'
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        System.out.println("HashSet:");

        for (String candidato: listaAprovados){
            System.out.println(candidato);
        }
        /*
        NOTA: HashSet não tem ordenação, logo os nomes aparecem em ordem diferente da que foram inclusos
         */

        SortedSet<String> lista = new TreeSet<>();
        /*
        TreeSet possui ordenação natural (alfabética, menor para maior, inserção, etc...)
        TreeSet faz parte do SortedSet que é um conjunto de outros conjuntos que aceitam ordenação
        A notação '<e>' se chama 'generics'
        */

        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Luca");
        lista.add("Pedro");

        System.out.println("\nTreeSet:");

        for (String candidato: lista){
            System.out.println(candidato);
        }


    }
}
