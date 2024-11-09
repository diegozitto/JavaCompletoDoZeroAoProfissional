package Modulo2_EstruturasDeControle.controle.aulas;

public class Aula8_For3 {
    public static void main(String[] args) {

        // Nesse caso o laço interno é executado 1º e quando chega ao 'fim' do seu primeiro loop
        // inicia-se o 2º loop do laço externo

        // 'fim" nesse caso seria quando sua expressão se torna falsa (quando atinge 9, nesse caso)

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf(" [i: %d , j: %d] ", i, j);
            }
            System.out.println();
        }

    }
}