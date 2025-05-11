package Modulo4_ArraysCollections.A3_Collections.A2_Set;

import java.util.HashSet;
import java.util.Set;

public class A2_ConjuntoBaguncado {

    @SuppressWarnings({"rawtypes", "unchecked"}) // serve apenas para remover os avisos amarelos [OPICIONAL]
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();
                               // por não suportar tipos primitivos ele faz a conversão:
        conjunto.add(1.2);     // double -> Double
        conjunto.add(true);    // boolean -> Boolean
        conjunto.add("Teste_A2"); // String não é primitivo
        conjunto.add(1);       // int -> Integer
        conjunto.add('x');     // char -> Character

        System.out.println("Tamanho é: " + conjunto.size());

        conjunto.add("Teste_A2"); // não aceita valor repetido
        System.out.println("Tamanho é: " + conjunto.size());

        System.out.println(conjunto.remove("teste")); // não existe
        System.out.println(conjunto.remove("Teste_A2"));
        System.out.println(conjunto.remove('x'));

        System.out.println("Tamanho é: " + conjunto.size());

        System.out.println(conjunto.contains('x')); // falso pois foi removido
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println("nums: " +nums);
        System.out.println("conjunto velho: " + conjunto);

//        conjunto.addAll(nums); // união dos elementos de 'nums' indo para 'conjunto'
          conjunto.retainAll(nums); // intersecção, pega o que há em comum em ambos e mantém no no novo conjunto
        System.out.println();

        System.out.println("nums: " + nums);
        System.out.println("conjunto novo: " + conjunto);

        System.out.println();

        conjunto.clear();

        System.out.println("nums: " + nums);
        System.out.println("conjunto novo2: " + conjunto);


    }
}
