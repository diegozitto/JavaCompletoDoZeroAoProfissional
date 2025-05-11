package Modulo5_OrientacaoObjeto.A3_UmParaMuitos;

public class CompraTeste {

    public static void main(String[] args) {
        Compra_A3 compra1 = new Compra_A3();

        compra1.cliente = "João Pedro";

        compra1.itens.add(new Item("Caneta",20, 7.45));
        System.out.println(compra1.getValorTotal() + "\n");

        compra1.itens.add(new Item("Borracha",12, 3.89));
        System.out.println(compra1.getValorTotal() + "\n");

        compra1.itens.add(new Item("Caderno",3, 18.79));

        System.out.println(compra1.itens.size() + "\n");
        System.out.println(compra1.getValorTotal());

        for (Item name : compra1.itens){
            System.out.println(name.nome);
        }

    }

}
