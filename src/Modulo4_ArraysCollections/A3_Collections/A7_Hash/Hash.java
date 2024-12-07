package Modulo4_ArraysCollections.A3_Collections.A7_Hash;

import Modulo4_ArraysCollections.A3_Collections.A3_List.UsuarioList;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<UsuarioList> usuarios = new HashSet<UsuarioList>();

        usuarios.add(new UsuarioList ("Pedro"));
        usuarios.add(new UsuarioList ("Ana"));
        usuarios.add(new UsuarioList ("Guilherme"));

        boolean resultado = usuarios.contains(new UsuarioList("Guilherme"));
        System.out.println(resultado);
    }
}
