package Modulo4_ArraysCollections.A2_EqualsHashcode;

public class Usuario {
    String nome;
    String email;

    public boolean equals(Object objeto) {

        if (objeto instanceof Usuario) {
            Usuario outro = (Usuario) objeto;
            // mesmo conceito de casting, convertendo o Objeto para ser do tipo Usuario
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);
            return nomeIgual && emailIgual;

        } else {
            return false;
        }

    }

    // O hashcode será abordado em outra aula!!


    public int hashCode() {
        return 0;
    }
}
