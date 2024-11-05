package Modulo1_Fundamentos.fundamentos.inicio;
public class AreaCircunferencia {
    public static void main(String[] args) {

        double raio = 3.4;

        // Ao colocar a palavra 'final', estamos afirmando que o valor passado não poderá ser alterado
        final double PI   = 3.14159;

        double area = PI * (raio * raio);
        System.out.printf("Área é igual a: %.2f m²", area);
    }
}
