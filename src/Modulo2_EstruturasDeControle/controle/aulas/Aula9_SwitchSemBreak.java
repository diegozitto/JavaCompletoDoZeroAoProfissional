package Modulo2_EstruturasDeControle.controle.aulas;

public class Aula9_SwitchSemBreak {
    public static void main(String[] args) {

        String faixa = "preta";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei o Bassai-Dai...");
            case "marrom":
                System.out.println("Sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heian Godan");
            case "verde":
                System.out.println("Sei o Heian Yodan");
            case "laranja":
                System.out.println("Sei o Heian Sandan");
            case "vermelha":
                System.out.println("Sei o Heian Nidan");
            case "amarela":
                System.out.println("Sei o Heian Shodan");
            default:
                System.out.println("Não sei de nada");
        }
        // Por não ter o break;, ele executa todos os blocos de
        // código abaixo
    }
}