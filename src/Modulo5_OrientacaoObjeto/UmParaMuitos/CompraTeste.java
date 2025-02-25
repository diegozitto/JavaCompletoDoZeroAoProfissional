package Modulo5_OrientacaoObjeto.UmParaMuitos;

public class CompraTeste {

    public static void main(String[] args) {
        Compra compra1 = new Compra();

        compra1.cliente = "João Pedro";

        compra1.itens.add(new Item("Caneta",20, 7.45));
        System.out.println(compra1.getValorTotal() + "\n");

        compra1.itens.add(new Item("Borracha",12, 3.89));
        System.out.println(compra1.getValorTotal() + "\n");

        compra1.itens.add(new Item("Caderno",3, 18.79));

        System.out.println(compra1.itens.size() + "\n");
        System.out.println(compra1.getValorTotal());

    }

}
