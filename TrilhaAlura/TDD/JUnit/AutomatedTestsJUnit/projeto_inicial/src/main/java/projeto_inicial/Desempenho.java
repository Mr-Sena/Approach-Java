package projeto_inicial;

import java.math.BigDecimal;

public enum Desempenho {
	A_DESEJAR {
		@Override
		public BigDecimal percentualReajusteSalarial() {
			return new BigDecimal("0.03");
		}
	}, 
	BOM {
		@Override
		public BigDecimal percentualReajusteSalarial() {
			return new BigDecimal("0.15");
		}
	}, 
	OTIMO {
		@Override
		public BigDecimal percentualReajusteSalarial() {
			return new BigDecimal("0.20");
		}
	};
	
	
	//As ENUMS Implementa esse m�todo logo abaixo da sua defini��o
	public abstract BigDecimal percentualReajusteSalarial ();
	
}