package Modulo3_Classes_E_Metodos.aulas;

public class Aula2_ProdutoTeste {
    public static void main(String[] args) {

        Aula2_Produto p1 = new Aula2_Produto(
                "Notebook",
                4356.89,
                0.25); // construtor


        var p2 = new Aula2_Produto(); // construtor
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.preco * (1 - p1.desconto);
        double precoFinal2 = p2.preco * (1 - p2.desconto);
        double mediaCarrinho  = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Média carrinho = R$%.2f.", mediaCarrinho);

        System.out.println("\nPreço com desconto: R$"+
                           p1.precoComDesconto(1000.0,0.40));
    }
}
