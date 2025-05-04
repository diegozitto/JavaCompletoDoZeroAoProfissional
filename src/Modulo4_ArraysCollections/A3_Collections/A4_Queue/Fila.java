package Modulo4_ArraysCollections.A3_Collections.A4_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

            // add e offer  adicinonam elementos na fila, a diferença é o comportamento quando a fila está cheia
        
            fila.add("Anna"); // caso a fila tenha um tamanho pré-definido, gera um erro por não conseguir adicionar
            
            fila.offer("Bia"); // retorna verdadeiro ou falso, se fila cheia = false, se não = true
            
            fila.add("Carlos");
            
            fila.offer("Daniel");
            
            fila.add("Rafaela");
            
            fila.offer("Gui");

            System.out.println("peek: " + fila.peek());    // le um elemento na fila, se fila vazia = retorna 'null'
            System.out.println("element: " + fila.element()); // le um elemento na fila, se fila vazia = retorna 'exception, noSuchElementException'
            // peek e element obtém um elemento na fila sem remove-lo

            /**
             * limpa a fila
             */
//            fila.clear();

            /**
             * retorna o tamnho da fila
             */
//            fila.size();

            /**
             * para saber se a fila está ou não vazia
             */
//            fila.isEmpty();

            /**
             * retorna o primeiro elemento da fila e remove ele
             * retorna 'null' com fila vazia
             */
            System.out.println("poll: " + fila.poll());

            /**
             * retorna o primeiro elemento da fila e remove ele
             * retorna 'exceção' com fila vazia
             */
            System.out.println("remove: " + fila.remove());

            System.out.println("poll: " + fila.poll());
            System.out.println("poll: " + fila.poll());
            System.out.println("poll: " + fila.poll());
            System.out.println("poll: " + fila.poll());

            System.out.println("poll: " + fila.poll());
            System.out.println("remove: " + fila.remove()); 

    }
}
