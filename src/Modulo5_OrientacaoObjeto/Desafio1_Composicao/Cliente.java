package Modulo5_OrientacaoObjeto.Desafio1_Composicao;

import java.util.*;

public class Cliente {

    String nome;
    ArrayList<Compra> compras = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }

    void adicionarCompra(Compra compra) {
        this.compras.add(compra);
    }

    double getValorTotalCompra() {
        double valorTotal = 0;

        for (Compra compra : compras) {
            valorTotal += compra.getValorTotalDeItem();
        }
        return valorTotal;
    }
    double getTotal(Item item1, Item item2){
        double somaItens = 0;

        for (Compra compra : compras) {
            somaItens += ((item1.quantidade * item1.produto.preco)
                    + (item2.quantidade * item2.produto.preco));
        }
        return somaItens;
    }


}
//Todo:
//    -Finalizar a junção dos métodos para gerar o obterValorTotal na classe Cliente
