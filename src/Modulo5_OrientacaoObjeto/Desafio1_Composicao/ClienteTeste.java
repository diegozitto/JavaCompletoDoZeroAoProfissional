package Modulo5_OrientacaoObjeto.Desafio1_Composicao;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João");

        Produto p1 = new Produto(5.50, "Leite");
        Produto p2 = new Produto(2.50, "Adoçante");

        Item item1 = new Item(1, p1);
        Item item2 = new Item(1, p2);

        Compra mercado = new Compra();
        mercado.itens.add(item1);
        mercado.itens.add(item2);
        System.out.println(mercado.getValorTotalDeItem());

        cliente1.adicionarCompra(mercado);
        System.out.println(mercado.getValorTotalDeItem());
        System.out.println(cliente1.getValorTotalCompra());

    }
}
