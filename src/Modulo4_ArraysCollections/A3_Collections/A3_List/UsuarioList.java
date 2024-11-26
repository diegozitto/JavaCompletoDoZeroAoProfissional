package Modulo4_ArraysCollections.A3_Collections.A3_List;

import java.util.Objects;

public class UsuarioList {

    String nome;

    UsuarioList(String nome){
        this.nome = nome;
    }

    public String toString() {
        return "Meu nome é " + this.nome + "." ;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        UsuarioList usuarioList = (UsuarioList) object;
        return Objects.equals(nome, usuarioList.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
