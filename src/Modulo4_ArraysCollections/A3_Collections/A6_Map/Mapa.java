import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {
        
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Roberto"); // adiciona se não existir, substitui caso já exista
        usuarios.put(1, "Ricardo");
        usuarios.put(1, "Ricardo");

        System.out.println(usuarios.size());


            

    }

}
