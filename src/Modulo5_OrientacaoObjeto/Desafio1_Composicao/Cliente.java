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
            valorTotal += compra.getValorTotalDaCompra();
        }
        return valorTotal;

    }


}