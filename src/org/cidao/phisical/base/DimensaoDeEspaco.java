package org.cidao.phisical.base;

import java.math.BigDecimal;

public abstract class DimensaoDeEspaco {

	public static final int DECAMETRO = 1;
	public static final int METRO = 2;
	public static final int DECIMETRO = 3;
	public static final int CENTIMETRO = 4;
	public static final int MILIMETRO = 5;
	
	
	public static final BigDecimal converter(int dimensaoDe, int dimensaoPara, BigDecimal valor) {
		
		switch (dimensaoDe) {
		case METRO:
			switch (dimensaoPara) {
			case METRO:
				return valor;
			case CENTIMETRO:
				return valor.multiply(BigDecimal.valueOf(100.00));
			default:
				return valor;
			}
			

		default:
			return valor;
		}
		
	}
	
	public static final BigDecimal auxiliar(int dimensaoDe, int dimensaoPara, BigDecimal valor) {
		
		
		return valor;
	}
}
