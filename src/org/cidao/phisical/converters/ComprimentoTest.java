package org.cidao.phisical.converters;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class ComprimentoTest {

	@Test
	public void testConverterMetroToQuilometro() {
		double dimensaoDe = Comprimento.METRO;
		double dimensaoPara = Comprimento.QUILOMETRO;
		BigDecimal valor = BigDecimal.valueOf(3200.00);
		BigDecimal valorEsperado = BigDecimal.valueOf(3.20);
		BigDecimal valorAtual = BigDecimal.ZERO;
		
		//dispara o metodo a ser testado
		valorAtual = Comprimento.converter(dimensaoDe, dimensaoPara, valor);
		
		//compara os valores esperado x formado
		assertEquals(valorEsperado, valorAtual);
				
	}

	@Test
	public void testConverterQuilometroToMetro() {
		double dimensaoDe = Comprimento.QUILOMETRO;
		double dimensaoPara = Comprimento.METRO;
		BigDecimal valor = BigDecimal.valueOf(3.20);
		BigDecimal valorEsperado = BigDecimal.valueOf(3200.00);
		BigDecimal valorAtual = BigDecimal.ZERO;
		
		//dispara o metodo a ser testado
		valorAtual = Comprimento.converter(dimensaoDe, dimensaoPara, valor);
		
		//compara os valores esperado x formado
		assertEquals(valorEsperado, valorAtual);
				
	}
	
	@Test
	public void testConverterMetroToMetro() {
		double dimensaoDe = Comprimento.METRO;
		double dimensaoPara = Comprimento.METRO;
		BigDecimal valor = BigDecimal.valueOf(3200.00);
		BigDecimal valorEsperado = BigDecimal.valueOf(3200.00);
		BigDecimal valorAtual = BigDecimal.ZERO;
		
		//dispara o metodo a ser testado
		valorAtual = Comprimento.converter(dimensaoDe, dimensaoPara, valor);
		
		//compara os valores esperado x formado
		assertEquals(valorEsperado, valorAtual);
				
	}
}
