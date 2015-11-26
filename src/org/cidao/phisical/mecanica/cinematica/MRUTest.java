package org.cidao.phisical.mecanica.cinematica;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class MRUTest {
	
	//valores padroes
	private static int precisao = 12;
	private static int aredondamento = BigDecimal.ROUND_HALF_EVEN;
	
	@Test
	public void testCalcularVelocidadeMedia() {
		//valores a serem calculados
		BigDecimal variacaoEspaco = BigDecimal.valueOf(32.00);
		BigDecimal variacaoTempo = BigDecimal.valueOf(8.00);
		BigDecimal velocidadeMediaEsperada = BigDecimal.valueOf(4.00).setScale(precisao, aredondamento);
		BigDecimal velocidadeMediaAtual;
		
		//dispara o metodo a ser testado
		velocidadeMediaAtual = MRU.calcularVelocidadeMedia(variacaoEspaco, variacaoTempo, precisao, aredondamento);
		
		//compara os valores esperado x formado
		assertEquals(velocidadeMediaEsperada, velocidadeMediaAtual);
	}

	@Test
	public void testCalcularVelocidadeMediaTempoIgualZero() {
		//valores a serem calculados
		BigDecimal variacaoEspaco = BigDecimal.valueOf(32.00);
		BigDecimal variacaoTempo = BigDecimal.ZERO;
		BigDecimal velocidadeMediaEsperada = BigDecimal.ZERO;
		BigDecimal velocidadeMediaAtual;
		
		//dispara o metodo a ser testado
		velocidadeMediaAtual = MRU.calcularVelocidadeMedia(variacaoEspaco, variacaoTempo, precisao, aredondamento);
		
		//compara os valores esperado x formado
		assertEquals(velocidadeMediaEsperada, velocidadeMediaAtual);
	}
	
	@Test
	public void testCalcularVariacaoEspaco() {
		//valores a serem calculados
		BigDecimal velocidadeMedia = BigDecimal.valueOf(4.00);
		BigDecimal variacaoTempo = BigDecimal.valueOf(8.00);
		BigDecimal variacaoEspacoEsperada = BigDecimal.valueOf(32.00);
		BigDecimal variacaoEspacoAtual = BigDecimal.ZERO;
		MRU.calcularVariacaoEspaco(velocidadeMedia, variacaoTempo);
		//dispara o metodo a ser testado
		variacaoEspacoAtual = MRU.calcularVariacaoEspaco(velocidadeMedia, variacaoTempo).setScale(1);
		
		//compara os valores esperado x formado
		assertEquals(variacaoEspacoEsperada, variacaoEspacoAtual);
	}

}
