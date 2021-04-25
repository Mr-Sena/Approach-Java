package colecao;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("Quem comeu meu queijo?");
		livros.push("Python");
		livros.push("Blockchain B�sico");
		livros.add("T�cnicas de Invs�o - Aprenda as t�cnicas usadas por Hackers");
		
		//ver a classe Fila para consultar os m�todos - que funcionam semelhantemente
		
		System.out.println(livros.peek());
		System.out.println(livros.peek());
		System.out.println(livros.element());


		System.out.println(livros.poll());
		System.out.println(livros.remove());
		System.out.println(livros.poll());
		System.out.println(livros.pop());
		
		
	}
	
}
