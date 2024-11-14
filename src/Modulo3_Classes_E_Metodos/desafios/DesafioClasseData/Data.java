package Modulo3_Classes_E_Metodos.desafios.DesafioClasseData;

public class Data {
    Integer dia,mes,ano;
    String d,m,a,dataFormatada;

    // 2º desafio [desafio métodos]
    // criar um m.é.t.o.d.o que receba parâmetros ou não e que retorne a data formatada

    String obterDataFormatada(){
        d = Integer.toString(dia);
        m = Integer.toString(mes);
        a = Integer.toString(ano);
        dataFormatada = d +"/"+ m +"/"+ a;

        return dataFormatada;
    }

    // 3º desafio [desafio construtores]
    // Criar 2 construtores dentro da classe Data [const.Padrão e construtor que receba dia,mes e ano]
    // Quando for chamado o construtor padrão, dia e mes precisam ser 1 e ano 1970 [isso por padrão]

    Data (int diaInicial,int mesInicial, int anoInicial){
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }

    Data(){
        dia = 1;
        mes = 1;
        ano = 1970;
    }
}
