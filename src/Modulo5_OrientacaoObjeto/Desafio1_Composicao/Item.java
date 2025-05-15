package Modulo5_OrientacaoObjeto.Desafio1_Composicao;

public class Item {

    int quantidade = 0;
    Produto produto;

    Item(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    double getValorTotal() {
        return this.produto.preco * this.quantidade;
    }


}