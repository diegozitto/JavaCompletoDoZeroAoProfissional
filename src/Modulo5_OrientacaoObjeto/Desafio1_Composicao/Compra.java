package Modulo5_OrientacaoObjeto.Desafio1_Composicao;

import java.util.ArrayList;

public class Compra {

    ArrayList<Item> itens = new ArrayList<Item>();

    double getValorTotalDeItem() {
        double somaItens = 0;
        for (Item item : itens) {
            somaItens += (item.quantidade * item.produto.preco);
        }
        return somaItens;
    }


}