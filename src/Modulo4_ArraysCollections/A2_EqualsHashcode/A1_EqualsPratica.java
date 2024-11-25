package Modulo4_ArraysCollections.A2_EqualsHashcode;

//import java.util.Date;

public class A1_EqualsPratica {
    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@zemail.com.br";

        Usuario u2 = new Usuario();
        u2.nome = "Pedro Silva";
        u2.email = "pedro.silva@zemail.com.br";

        System.out.println(u1 == u2); // falso
        System.out.println(u1.equals(u2)); // falso, se torna verdeiro após a implementação e alteração do Equals
        System.out.println(u2.equals(u1)); // falso, se torna verdeiro após a implementação e alteração do Equals

//        System.out.println(u2.equals(new Date()));


    }
}
