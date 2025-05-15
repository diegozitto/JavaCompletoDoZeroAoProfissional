package Modulo5_OrientacaoObjeto.Desafio1_Composicao;

import java.util.ArrayList;

public class Compra {

    ArrayList<Item> itens = new ArrayList<Item>();

    double getValorTotalDaCompra() {
        double somaItens = 0;
        for (Item item : itens) {
            somaItens += item.getValorTotal();
        }
        return somaItens;
    }


}