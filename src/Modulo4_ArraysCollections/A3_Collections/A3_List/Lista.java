package Modulo4_ArraysCollections.A3_Collections.A3_List;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {

        ArrayList<UsuarioList> lista = new ArrayList<>();

        UsuarioList u1 = new UsuarioList("Ana");

        lista.add(u1);
        lista.add(new UsuarioList("Carlos"));  //removido
        lista.add(new UsuarioList("Lia"));
        lista.add(new UsuarioList("Bia"));
        lista.add(new UsuarioList("Manu"));    //removido

        System.out.println("\n"+lista.get(3)); // acessar pelo índice
        System.out.println();
        
        System.out.println(">>>>>> "+lista.remove(1));
        System.out.println(lista.remove(new UsuarioList("Manu")));
        
        System.out.println("Tem? " + lista.contains(new UsuarioList("Lia")));

        for (UsuarioList u : lista) {
            System.out.println(u.toString());
        }

    }
}
