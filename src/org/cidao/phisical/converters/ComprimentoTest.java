package org.cidao.phisical.converters;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.cidao.phisical.converters.unidades.Comprimento;
import org.junit.Test;

public class ComprimentoTest {

	@Test
	public void testConverterMetroToQuilometro() {
		Comprimento dimensaoDe = Comprimento.METRO;
		Comprimento dimensaoPara = Comprimento.QUILOMETRO;
		BigDecimal valor = BigDecimal.valueOf(3200.00);
		BigDecimal valorEsperado = BigDecimal.valueOf(3.20);
		BigDecimal valorAtual = BigDecimal.ZERO;
		
		//dispara o metodo a ser testado
		valorAtual = ConversorDeUnidade.converter(dimensaoDe, dimensaoPara, valor);
		
		//compara os valores esperado x formado
		assertEquals(valorEsperado, valorAtual);
				
	}

	@Test
	public void testConverterQuilometroToMetro() {
		Comprimento dimensaoDe = Comprimento.QUILOMETRO;
		Comprimento dimensaoPara = Comprimento.METRO;
		BigDecimal valor = BigDecimal.valueOf(3.20);
		BigDecimal valorEsperado = BigDecimal.valueOf(3200.00);
		BigDecimal valorAtual = BigDecimal.ZERO;
		
		//dispara o metodo a ser testado
		valorAtual = ConversorDeUnidade.converter(dimensaoDe, dimensaoPara, valor);
		
		//compara os valores esperado x formado
		assertEquals(valorEsperado, valorAtual);
				
	}
	
	@Test
	public void testConverterMetroToMetro() {
		Comprimento dimensaoDe = Comprimento.METRO;
		Comprimento dimensaoPara = Comprimento.METRO;
		BigDecimal valor = BigDecimal.valueOf(3200.00);
		BigDecimal valorEsperado = BigDecimal.valueOf(3200.00);
		BigDecimal valorAtual = BigDecimal.ZERO;
		
		//dispara o metodo a ser testado
		valorAtual = ConversorDeUnidade.converter(dimensaoDe, dimensaoPara, valor);
		
		//compara os valores esperado x formado
		assertEquals(valorEsperado, valorAtual);
				
	}
}
