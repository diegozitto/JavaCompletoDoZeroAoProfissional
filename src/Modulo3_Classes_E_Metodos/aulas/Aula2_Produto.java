package Modulo3_Classes_E_Metodos.aulas;

public class Aula2_Produto {

    String nome;
    Double preco;
    Double desconto;

    // Aula 4.1 Construtores: Criando um novo construtor para a classe Produto

    Aula2_Produto(String nomeInicial,
                  Double precoInicial,
                  Double descontoInicial){
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    Aula2_Produto(){

    }

    /**
     * @param desconto deve ser passado como número quebrado
     * Ex:
     * 5%  --> 0.05 ||
     * 10% --> 0.10 ||
     * 25% --> 0.25 ||
     * 50% --> 0.50 |
     * @return double
     */
    double precoComDesconto(Double preco, Double desconto){
        Double novoPreco = preco - (preco * desconto);
        return novoPreco;
    }

}
