package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
  public static void main(String[] args) {
    
    Queue<String> fila = new LinkedList<>();

    // offer / add -> adicionam elementos na fila da mesma forma mas divergem em seu comportamento quando a fila está cheia.
    fila.add("Ana"); // retorna false
    fila.offer("Bia"); // lança uma exceção
    
    // peek / element -> ambos retornam o próximo elemento da fila sem removê-lo, mas diferem ao tentar retornar um elemento de uma fila vazia. 
    System.out.println(fila.peek()); // retorna null
    System.out.println(fila.element()); // lança uma exceção

    
    // retorna o próximo elemento removendo-o ao mesmo tempo.
    System.out.println(fila.poll()); // retorna false
    System.out.println(fila.remove()); // lança exceção

    // fila.size();
    // fila.clear();
    // fila.isEmpty();

    
  }
}
