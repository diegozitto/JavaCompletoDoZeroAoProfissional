package Modulo3_Classes_E_Metodos.desafiosDoModulo;

public class Pessoa {

    String nomePessoa;
    double pesoPessoa;


    //construtor
    public Pessoa(String nomePessoa, double pesoPessoa){
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
    }

    /**
     *
     * @param comida
     * @return novoPeso
     */
    public Object comer (Comida comida){
        double pesoComida = comida.pesoComida;
        double novoPeso   = this.pesoPessoa += comida.pesoComida;

        System.out.println("\nComida: " + comida.nomeComida +
                           "\nPeso da pessoa: " + pesoPessoa +
                           "\nNome da pessoa: " + nomePessoa);

        System.out.println("Peso comida: " + pesoComida);

        return String.format("Novo peso da pessoa: %.2f Kg", novoPeso);
    }

    String apresentar(){
        return "\nOlá, eu sou o " + nomePessoa + " e tenho " + pesoPessoa + " Kgs.";
    }


}
/*
 Solução professor:

        void comer (Comida comida){
            if(comida != null){
                this.peso += comida.peso;
            }
        }

        String apresenta(){
            return "Olá, eu sou o " + nome + " e tenho " + peso + " Kgs.";
        }
 */