package Modulo5_OrientacaoObjeto.Desafio1_Composicao;

import java.util.ArrayList;

public class Item {

    double quantidade = 0;
    Produto produto = new Produto();
    ArrayList<Produto> produtos = new ArrayList<Produto>();

    void adicionarProduto(Produto product){
        this.produtos.add(product);
    }

    double obterQuantidadeDeProdutos(Produto product){
        double contador = 0;
            for ( Produto products : produtos){
                if (product.nome.equals(products.nome)){
                    contador ++;
                }
            }
            return Math.round(contador);
    }

    double obterValorDeProdutos(Produto product){
        double preco = product.preco;
        return Math.round(preco);
    }

    double obterValorTotal (Produto product){
        System.out.print("O valor total do produto " + product.nome + " por quantidade é: ");
         return obterValorDeProdutos(product) * obterQuantidadeDeProdutos(product);
    }


}

