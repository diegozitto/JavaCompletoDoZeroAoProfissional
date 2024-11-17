package Modulo3_Classes_E_Metodos.aulas;

import Modulo3_Classes_E_Metodos.desafios.DesafioClasseData.Data;

public class Aula8_ValorVsReferencia {
    public static void main(String[] args) {

        double a = 2;
        double b = a; //atribuição por valor, uma cópia do valor é definida na memória (Tipo primitivo)

        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data(1,6,2022);
        Data d2 = d1; // atribuição por referência (Objeto)

        d1.dia = 31;
        d2.mes = 12;
        d1.ano = 2025;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
        // iguais pois mesmo mexendo apenas em um, ambos apontam para o mesmo
        // local de memória por referência

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);
    }
    static void voltarDataParaValorPadrao(Data d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void alterarPrimitivo(int a){
        a++;
    }
}
