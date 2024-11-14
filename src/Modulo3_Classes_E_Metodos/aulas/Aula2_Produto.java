package Modulo3_Classes_E_Metodos.aulas;

public class Aula2_Produto {

    String nome;
    Double preco;
    static Double desconto = 0.25;

    // Aula 4.1 Construtores: Criando um novo construtor para a classe Produto
    
    //-------------------CONSTRUTORES---------------------
    Aula2_Produto(String nomeInicial, Double precoInicial){
        nome = nomeInicial;
        preco = precoInicial;
    }

    Aula2_Produto(){

    }
    //----------------------------------------------------
    
    double precoComDesconto(){
        Double novoPreco = preco - (preco * desconto);
        return novoPreco;
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
    double precoComDescontoEspecial(Double preco, Double desconto){
        Double novoPreco = preco - (preco * desconto);
        return novoPreco;
    }

}
