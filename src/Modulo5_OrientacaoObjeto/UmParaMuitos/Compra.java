package Modulo5_OrientacaoObjeto.UmParaMuitos;

import java.util.ArrayList;

public class Compra {

    // Para uma compra ter vários itens fazemos assim:
    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    double getValorTotal(){
        double total = 0;

        for(Item item:itens){
            total = total + (item.preco * item.quantidade);
        }

        return total;
    }
}
