package poo;

public interface constatacoes {
	
	//M�t�dos em interface normalmente n�o possuem {corpo} - s�o abstratos
	//Por�m utilizando deafult � poss�vel
	default int confirma() {
		return 0;
	}

}
