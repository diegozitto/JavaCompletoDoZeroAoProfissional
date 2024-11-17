package Modulo3_Classes_E_Metodos.desafios.DesafioClasseData;

public class Data {

    public int dia, mes, ano;

    public String d, m, a, dataFormatada;

    public Data(){
//        dia = 1;
//        mes = 1;
//        ano = 1970;
        this(1,1,1970); // this() pode ser usado para chamar um construtor dentro de outro construtor
    }

    /*
    this() --> sempre que usar como méto.do, significa que está chamando um construtor e só pode ser usado dentro e com
               construtores.

    this   --> usado para referenciar métodos e argumentos de instância da classe

                           this 	                   |                      this()
                Referência ao objeto atual.            |     	Chama outro construtor da mesma classe.
            Usado em qualquer métod.o ou bloco.	       |             Usado apenas em construtores.
            Não precisa ser a primeira instrução.	   |     Deve ser a primeira instrução no construtor.

      this:
        public class Exemplo {
                private String nome;

            public Exemplo(String nome) {
                this.nome = nome; // 'this.nome' refere-se ao atributo da classe
            }
        }

      this():
        public class Exemplo {
            private String nome;
            private int idade;

                                            // Construtor 1
            public Exemplo(String nome) {
                this(nome, 0); // Chama o Construtor 2
            }

            // Construtor 2
            public Exemplo(String nome, int idade) {
                this.nome = nome;
                this.idade = idade;
            }
        }

        Assim que um construtor tenha sido chamado dentro de outro, ele não pode ser re-chamd
     */

    // 3º desafio [desafio construtores]
    // Criar 2 construtores dentro da classe Data [const.Padrão e construtor que receba dia,mes e ano]
    // Quando for chamado o construtor padrão, dia e mes precisam ser 1 e ano 1970 [isso por padrão]

    public Data (int dia,int mes, int ano){
        this.dia = dia; // ao usar o 'this.' é possível alterar o valor da variável de instância pelo valor recebido como argumento
        this.mes = mes; // this não pode ser usado em métodos estáticos
        this.ano = ano;
    }



    // 2º desafio [desafio métodos]
    // criar um m.é.t.o.d.o que receba parâmetros ou não e que retorne a data formatada

    public String obterDataFormatada(){
        d = Integer.toString(dia);
        m = Integer.toString(mes);
        a = Integer.toString(ano);
        dataFormatada = d +"/"+ m +"/"+ a;

        return this.dataFormatada;
    }

    public String obterDataFormatadaProfessor(){
        final String formato = "%d/%d/%d";
        // |--> variável local pode ser definida no escopo(dentro) dos métodos ou ser uma instância de classe
        // ao usar o final ela se torna uma 'constante' local
        return String.format(formato,this.dia,mes,ano);
    }

}
