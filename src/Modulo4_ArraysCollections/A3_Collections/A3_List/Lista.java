package Modulo4_ArraysCollections.A3_Collections.A3_List;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {

        ArrayList<UsuarioList> lista = new ArrayList<>();

        UsuarioList u1 = new UsuarioList("Ana");

        lista.add(u1);
        lista.add(new UsuarioList("Carlos"));
        lista.add(new UsuarioList("Lia"));
        lista.add(new UsuarioList("Bia"));
        lista.add(new UsuarioList("Manu"));

        System.out.println("Índice 3: " + lista.get(3));

        for (UsuarioList u : lista) {
            System.out.println(u.nome);
        }

    }
}
