package lambdaExpression;

import java.util.function.BinaryOperator;

//Seja bem vindo ao pr�ximo n�vel: programa��o funcional
//essencialmente pressente na vida de alguns programadores de outra linguagem (como o JS), traz um paradgima de alto n�vel de abstra��o
//por�m, inicialmente parece ser contra intu�tivo - at� pq Java e altamente reconhecido pelo paradigma imperativo, com Prog. Orient. a Obj. e n�o declarativa



@FunctionalInterface //Essa anota��o serve para validar que a Interface seja funcional (tenha somente 1 m�todo) para aplicar a Lambda Expression. Portando a notation � dispnes�vel
public interface Calculo {
	
	double executar(double a, double b);

	//double execute(double a, double b); --> Se esse m�todo for definido a interface deixa de ser funcional.
	//H� a possibilidade de exisitir mais de um m�otodo, por�m eles devem ser deafult:
	default double exec (double a, double b) {
		return a+b;
	}
	
	//Outro modo de definir mais m�todos:
	
	static String msg() {
		return "Hi there";
	//Lembrando que tudo o que � static � uma propriedade da Classe e n�o da inst�ncia, portanto n�o sendo acess�vel a este.
	}
	
	
	
	
	
	//M�todo Mais Comum
	// Implementa��o do m�todo acima (o que n�o seria estrategicamente interessante como a express�o lambda -> final do c�digo)
	//(S� para efeito de ilustra��o, atrav�s da modo de funcionamento acustumado at� ent�o)
	public class Somar implements Calculo {
		public double executar(double a, double b) {
			return a + b;
		}
	}
	
	//Veja o resultado e a diferen�as das solu��es no m�todo main abaixo 
	
	
	
	
	
	
	
	//Runtime application
	public static void main(String[] args) {
		var calculo = new Somar(); // Maneira mais popular
		Calculo calc = (x, y) ->  x + y; // Modo mais pragm�tico
		
		System.out.println("Valores somado (com cria��o e instacia��o de classe): " + calculo.executar(2, 3));
		System.out.println("Valores somado (com express�o lambda): " + calc.executar(2,  3));

		calc = (a, b) -> a * b;
		System.out.println("Valores multiplicado: " + calc.executar(2,  3));
		
		System.out.println(Calculo.msg());
		
		//Existe um template, BinaryOperator, que j� traz uma interfacer funcional para usar a express�o lambda... Veja na pr�tica:
		
		BinaryOperator<Integer> autoCalculo = (a, b) -> a * b; // O binaryOperator recebe dois operandos e r
		
		System.out.println(autoCalculo.apply(2, 3));
	}
}

