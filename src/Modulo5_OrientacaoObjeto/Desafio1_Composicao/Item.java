package Modulo5_OrientacaoObjeto.Desafio1_Composicao;

import java.util.ArrayList;

public class Item {

    double quantidade = 0;
    Produto produto = new Produto();
    ArrayList<Produto> produtos = new ArrayList<Produto>();

    void adicionarProduto(Produto product){
        this.produtos.add(product);
    }

    double obterQuantidadeDeProdutos(Produto nome){
        double contador = 0;
            for ( Produto product : produtos){
                if (product.nome.equals(nome.nome)){
                    contador ++;
                }
            }
        System.out.printf("Nosso estoque de " + nome.nome + " é :");
            return contador;
    }

    double obterValorDeProdutos(Produto product){
        double preco = product.preco;
        System.out.printf("Cada " + product.nome + " está por R$ ");
        return preco;
    }

}

