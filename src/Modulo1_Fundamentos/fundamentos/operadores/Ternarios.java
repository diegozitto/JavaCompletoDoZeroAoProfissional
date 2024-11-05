package Modulo1_Fundamentos.fundamentos.operadores;

public class Ternarios {
    public static void main(String[] args) {

        double media = 7.6;

        String resultadoRecuperação = media >= 5.0 ? "reprovado." : "em recuperação.";

        String resultado = media >= 7.0 ? "aprovado." : resultadoRecuperação;

        System.out.println("O aluno está " + resultado +
                           "\nMédia: "     + media );
    }
}
