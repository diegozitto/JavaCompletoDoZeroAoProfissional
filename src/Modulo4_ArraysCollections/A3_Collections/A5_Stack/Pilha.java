package Modulo4_ArraysCollections.A3_Collections.A5_Stack;

import java.util.Deque;

import java.util.ArrayDeque;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<String>();

        livros.add("O Pequeno Príncipe"); // retorna booleano
        livros.push("Dom Quixote");       // retorna uma exceção caso o limite tenha sido atingido
        livros.push("O hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.pop());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());

    }
}
