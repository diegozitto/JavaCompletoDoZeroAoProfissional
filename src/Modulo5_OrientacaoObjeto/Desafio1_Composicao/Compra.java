package Modulo5_OrientacaoObjeto.Desafio1_Composicao;

import java.util.ArrayList;

public class Compra {

    Item item = new Item();
    ArrayList<Item> itens = new ArrayList<Item>();

    void adicionarItem(Item itens){
        this.itens.add(itens);
    }

}
