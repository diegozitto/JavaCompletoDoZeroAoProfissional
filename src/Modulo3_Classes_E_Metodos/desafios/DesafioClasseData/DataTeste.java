package Modulo3_Classes_E_Metodos.desafios.DesafioClasseData;

public class DataTeste {
    public static void main(String[] args) {
        Data data = new Data();
        data.dia = 7;
        data.mes = 4;
        data.ano = 2000;

       // System.out.println(data.dia + "/" + data.mes + "/" + data.ano);
        System.out.println(data.obterDataFormatada());

        // imprimindo novos construtores:
        System.out.println("-------DESAFIO CONSTRUTORES-------");

        Data d1 = new Data();
        System.out.println(d1.obterDataFormatada());

        Data d2 = new Data(28,7,2024);
        System.out.println(d2.obterDataFormatada());
    }
}
