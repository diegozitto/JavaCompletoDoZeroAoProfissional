package Modulo4_ArraysCollections.A3_Collections.A6_Map;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {
        
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Roberto"); // adiciona se não existir, substitui caso já exista
        usuarios.put(20, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println("Usuarios size: " + usuarios.size());
        System.out.println("Usuarios isEmpty: " + usuarios.isEmpty());

        System.out.println("Usuarios keySet: " + usuarios.keySet());
        System.out.println("Usuarios values: " + usuarios.values());

        System.out.println("Usuarios entrySet: " + usuarios.entrySet());

        System.out.println("Usuarios containsKey(<valor da chave>): " + usuarios.containsKey(20));
        System.out.println("Usuarios containsValue(<valor>): " + usuarios.containsValue("Rebeca"));

        System.out.println("Usuarios get(<valor da chave>): " + usuarios.get(20));

        /**
         * percorrer pela chave
         */
        for (int chave : usuarios.keySet()){
            System.out.println("chave: " + chave);
        }

        /**
         * percorrer pelo valor
         */
        for (String valor : usuarios.values()){
            System.out.println("valor: " + valor);
        }

        /**
         * percorrer por ambos, Entry (java.util.Map)
         */
        for(Map.Entry<Integer, String> registro : usuarios.entrySet()){
            System.out.println("registro: " + registro);
        }

    }

}
