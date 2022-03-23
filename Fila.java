package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
//Offer e Add -> adicionam elementos na fila. Diferen�a � o comportamento quando a fila esta cheia
		fila.add("Ana"); // retorna FALSE
		fila.offer("Bia"); // retorna uma exce��o
		fila.add("Carlod");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
	
//Peel e Element -> Obtem o proximo elemento da fila (sem remover). Diferen�a e o comportamento quando a fila esta vazia
		System.out.println(fila.peek()); // retorna null 
		System.out.println(fila.peek());
		System.out.println(fila.element());// retorna uma exce��o
		System.out.println(fila.element());
		
//Poll e Remove -> Obtem o proximo elemento da fila e remove. Diferen�a e o comportamento quando a fila esta vazia
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove());;// retorna uma exce��o
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains(...);
	}
}
