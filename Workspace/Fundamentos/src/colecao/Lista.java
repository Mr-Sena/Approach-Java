package colecao;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
			
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1); //Adc o objeto criado, normal
		
		//Adicionando a inst�ncia do objeto, sendo criado no par�metro
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Charles"));
		lista.add(new Usuario("Jeferson"));
		lista.add(new Usuario("Carlos"));//Em listas podemos repetir valores.
		
		for(Usuario u : lista) {
			System.out.println(u.nome);
		}
		
		//Ao contr�rio do conjunto, lista � indexada, e pode ser acessado atrav�s
		System.out.println(lista.get(3).nome);
		
		//Antes de implementa o m�todo toString na classe o resultado s�ria uma ref�ncia para o espa�o na mem�ria
		System.out.println(lista.get(0)); // toString configurado para return "Meu nome � " + this.nome + "."

		System.out.println(lista.remove(1));//Removendo pelo �ndice retorna o valor
		System.out.println(lista);

		//Removendo pelo valor retorna um boolean(true or false)		
		System.out.println(lista.remove(new Usuario("Jeferson")));//Esse objeto n�o possui um nome de atribui��o, portanto a sua refer�ncia � indicada atrav�s da instancia��o, na chamada da classe 
		System.out.println(lista);
		
		//O objeto list ainda cont�m outros m�todos de return true or false, exemplo, contains 
		System.out.println(
		lista.contains(new Usuario("Carlos")) 
		+ " <- Carlos    Ana ->" + //Diferen�a no acesso de um objeto (Carlos via instancia��o e Ana via armazenamento - padr�o)
		lista.contains(u1)
				);
		
		
		
		
		
		
	}

}
