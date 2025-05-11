package Modulo5_OrientacaoObjeto.Desafio1_Composicao;

import java.util.*;

public class Cliente {

    String nome;
    Compra compra = new Compra();
    ArrayList<Compra> compras = new ArrayList<>();

    Cliente(String nome){
        this.nome = nome;
    }

    void adicionarCompra(Compra compra){
        this.compras.add(compra);
    }


}
