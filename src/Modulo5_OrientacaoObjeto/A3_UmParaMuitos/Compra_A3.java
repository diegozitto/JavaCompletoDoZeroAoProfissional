package Modulo5_OrientacaoObjeto.A3_UmParaMuitos;

import java.util.ArrayList;

public class Compra_A3 {


    String cliente;
    // Para uma compra ter vários itens fazemos assim:
    ArrayList<Item> itens = new ArrayList<Item>();
    // Ao criar uma lista do tipo "Item", podemo dizer que uma compra tem muitos itens

    double getValorTotal(){
        double total = 0;

        for(Item item:itens){
            total = total + (item.preco * item.quantidade);
        }

        return total;
    }
}
