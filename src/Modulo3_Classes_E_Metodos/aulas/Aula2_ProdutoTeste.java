package Modulo3_Classes_E_Metodos.aulas;

public class Aula2_ProdutoTeste {
    public static void main(String[] args) {

        Aula2_Produto p1 = new Aula2_Produto("Notebook",4356.89); // construtor

        var p2 = new Aula2_Produto(); // construtor
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        
        Aula2_Produto.desconto = 0.0;

        System.out.println(p1.nome + " " + p1.precoComDesconto());
        System.out.println();
        System.out.println(p2.nome + " " + p2.precoComDesconto());

        double precoFinal1 = p1.preco * (1 - Aula2_Produto.desconto);
        double precoFinal2 = p2.preco * (1 - Aula2_Produto.desconto);
        double mediaCarrinho  = (precoFinal1 + precoFinal2) / 2;

        System.out.println();
        System.out.printf("Média carrinho = R$%.2f.", mediaCarrinho);

        System.out.println();
        System.out.println("\nPreço do "+ p1.nome + " com desconto: R$" + p1.precoComDesconto());
    }
}
