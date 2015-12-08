package org.cidao.phisical.converters;

public enum ComprimentoTipos {

	QUILOMETRO(0.001), 
	DECAMETRO(0.01), 
	METRO(1), 
	DECIMETRO(10), 
	CENTIMETRO(100),
	MILIMETRO(1000);

	private final double valor;

	ComprimentoTipos(double valor) { 
		this.valor = valor; 
	}

	public double getValor() {
		return valor;
	}

}
