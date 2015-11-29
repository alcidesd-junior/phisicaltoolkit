package org.cidao.phisical.converters;

import java.math.BigDecimal;

public abstract class Comprimento {

	public static final double QUILOMETRO = 0.001;
	public static final double DECAMETRO = 0.01;
	public static final double METRO = 1;
	public static final double DECIMETRO = 10;
	public static final double CENTIMETRO = 100;
	public static final double MILIMETRO = 1000;
	
	
	public static final BigDecimal converter(double dimensaoDe, double dimensaoPara, BigDecimal valor) {
		
		if (dimensaoDe == dimensaoPara)
			return valor;
		else {
			BigDecimal fator = BigDecimal.ZERO;
			fator = BigDecimal.valueOf(dimensaoDe/dimensaoPara);
				return valor.divide(fator, BigDecimal.ROUND_HALF_EVEN);
		}		
	}
	
}
