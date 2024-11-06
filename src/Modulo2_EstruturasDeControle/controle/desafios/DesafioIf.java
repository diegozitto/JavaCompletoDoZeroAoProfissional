package Modulo2_EstruturasDeControle.controle.desafios;

public class DesafioIf {
    public static void main(String[] args){

        double nota = 1.3;

        if(nota >= 9.0);

        {   System.out.println("Quadro de Honra");
            System.out.println("Você é fera!!!");
        }
    }
}
// Onde está o bug e o que causou?

// Palpite: ao executar o código as mensagens aparecem, talvez por conta do ';'. Ele finaliza
// o espaço da condição e faz com que as frases apareceçam independentemente

// Estava certo, ah ééééééééé