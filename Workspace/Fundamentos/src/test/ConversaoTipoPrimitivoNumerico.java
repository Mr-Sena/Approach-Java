package test;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; // Convers�o impl�cita (DE INT PARA DOUBLE)
		//N�o h� conflitos nesse caso, j� que o double suporta mais bytes do que o int
		//Imprimindo o resultado da convers�o:
		System.out.println(a);
		
		
		//Convers�o expl�cita (obrigat�rio nesse caso pois n�mero com casas decimais, � por padr�o do tipo dobule).
		float b = (float) 1.2; //Obs: o float tem um n�mero de casas decimais mais limitado do que o double, e caso for ultrapassado, o valor ser� truncado
		//... Nesse caso poderia ser fazer a convers�o colocando somente o f depois do n�mero (float b = 12.2f)
		
		
		int c = 128;
		byte d = (byte) c; //Expl�cita (CAST)
		// O byte suporte armazenamento de 256 n�mers inteiros (-128 at� 127) - de modo que se ultrpassar esse valores limites, ele recome�a da outra extremidade do range
		System.out.println(d);
		System.out.println(129 - (c - (-128)));
		
		
		double e = 1.9999;
		int f = (int) e; // Nessa convers�o n�o h� arredonamento (pois o Java s� v� tipo, n�o valor na opera��o), tendo como resultado um valor truncado
		System.out.println(e);
		
		

	}

}
