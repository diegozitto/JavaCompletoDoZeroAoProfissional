package Modulo1_Fundamentos.desafios;

public class DesafioAritmeticos {
    public static void main(String[] args) {
         /*
         RESOLVER A EXPRESSÃO:
         ( [6*(3+2)]^2/3*2 - ((1-5)*(2-7)/2)^2 )^3 / 10^3
          */

        //Parte 1: [6*(3+2)]^2/3*2
        double expressao1 = (6 * (3 + 2));
        double divisao1 = 3 * 2;
        expressao1 = Math.pow(expressao1,2)/divisao1;

        //Parte 2: ( (1-5) * (2-7) /2 )^2
        double expressao2 =(1-5) * (2-7);
        expressao2 = expressao2/2;
        expressao2 = Math.pow(expressao2,2);

        //Parte 3: (expressao1 - expressao2) ^3 / 10^3
        double resultado = expressao1 - expressao2;
        resultado = Math.pow(resultado, 3);
        resultado = resultado / Math.pow(10,3);

        System.out.printf("O resultado é: %.0f", resultado);


    }
}
