package poo;

public abstract class AbstractClass {

	private String nome;
	private int idade;
	private String g�nero;

	AbstractClass(){} // Contructor
	
	


		public static void main(String[] args) {
		
			//Pessoa usuario = new Pessoa(); N�o � poss�vel instanciar a classe
			
			//M�s pode ser utilizada como tipo, veja:
			
			AbstractClass usuario = new Funcionario();
		
		}

}
