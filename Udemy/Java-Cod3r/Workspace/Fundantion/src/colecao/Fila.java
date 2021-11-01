package colecao;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		/*Offer e Add -> Adicionam elementos na fila
		Diferencia o comportatamento qundo a fila est� cheia!
		(Add ocorre uma exece��o quando a lista esta cheia
		enquando offer retorna false)*/
		fila.add("Jos�");
		fila.add("Tafnes");
		fila.offer("Bily");
		
		//Peek e Element -> obter o pr�ximo (o �ltimo) elemento - sem remover
		//Diferencia o comportamento quando a fila estiver vazia!
		//(peek retorna null, element aciona um exce��o
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
//		Ainda m�todos desta cole��o
//		fila.size()
//		fila.clear()
//		fila.isEmpty()
		System.out.println(fila.contains("Jos�"));
		
//		poll e remove -> obter o pr�ximo (o �ltimo) elemento, removendo-o
//		Diferencia o comportamento quando a fila estover vazia!
//		poll retorna null, e remove aciona uma exce��o
		
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		//System.out.println(fila.poll()); Return false
		//System.out.println(fila.remove()); para o programa com a expection
		
	}
	
}
