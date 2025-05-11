package Modulo5_OrientacaoObjeto.Desafio1_Composicao;

public class ClienteTeste {
    public static void main(String[] args) {

    Produto pulseira = new Produto("Pulseira",1790.85);
    Produto brinco = new Produto("Brinco",4000.00);
    Produto carro = new Produto("Carro",250000.00);
    Produto moto = new Produto("Moto",9000.00);

    Item bijuterias = new Item();
        bijuterias.adicionarProduto(pulseira);
        bijuterias.adicionarProduto(pulseira);
        bijuterias.adicionarProduto(brinco);
        bijuterias.adicionarProduto(brinco);

            System.out.println(bijuterias.obterQuantidadeDeProdutos(pulseira));
            System.out.println(bijuterias.obterValorDeProdutos(pulseira)+"\n");

            System.out.println(bijuterias.obterQuantidadeDeProdutos(brinco));
            System.out.println(bijuterias.obterValorDeProdutos(brinco)+"\n");

    Item automotivos = new Item();
        automotivos.adicionarProduto(carro);
        automotivos.adicionarProduto(moto);

            System.out.println(automotivos.obterQuantidadeDeProdutos(carro));
            System.out.println(automotivos.obterValorDeProdutos(carro)+"\n");

            System.out.println(automotivos.obterQuantidadeDeProdutos(moto));
            System.out.println(automotivos.obterValorDeProdutos(moto));

    }
}
