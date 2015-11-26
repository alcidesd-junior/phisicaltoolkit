/*
 *  MRU.java v1.0 - calculos de conceitos fisicos para cinematica (MRU, MRVU, etc)
 *  Copyright (C) 2015 Alcides Duarte Jr (Cidao)
 *  Carapicuiba, SP - Brazil
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 3.0 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.cidao.phisical.mecanica.cinematica;

import java.math.BigDecimal;

/**
 * Movimento Retilineo Uniforme
 * 
 * @author Alcides Duarte Jr 
 * @since 25-11-2015
 * @Version 1.0
 */
public abstract class MRU {

	/**
	 * <b>MRU</b> - Calcular a <i>velocidade media</i> de um movel que desloca-se entre um ponto A ate B em um determinado intervalo de tempo
	 * 
	 * @param variacaoEspaco <code>BigDecimal</code> - variacao do espaco entre dois pontos que representem o deslocamento de um movel
	 * @param variacaoTempo <code>BigDecimal</code> - variacao (intervalo) de tempo relacionado ao deslocamento de um movel
	 * @return velocidade media <code>BigDecimal</code>
	 */
	public static final BigDecimal calcularVelocidadeMedia(BigDecimal variacaoEspaco, BigDecimal variacaoTempo, int precisao, int arredondamento) {
		return (variacaoTempo.equals(BigDecimal.ZERO)? 
					BigDecimal.ZERO: 
					variacaoEspaco.divide(variacaoTempo, precisao, arredondamento));
	}
	
	public static final BigDecimal calcularVelocidadeMedia(BigDecimal variacaoEspaco, int dimensaoEspaco, BigDecimal variacaoTempo, int dimensaoTempo, int precisao, int arredondamento) {
		return (variacaoTempo.equals(BigDecimal.ZERO)? 
					BigDecimal.ZERO: 
					variacaoEspaco.divide(variacaoTempo, precisao, arredondamento));
	}
	
	/**
	 * <b>MRU</b> - Calcular a <i>variacao do espaco</i> (deslocamento entre um ponto A ate B) de um movel sabendo sua velocidade media e o intervalo de tempo 
	 * 
	 * @param variacaoEspaco <code>BigDecimal</code> - variacao do espaco entre dois pontos que representem o deslocamento de um movel
	 * @param variacaoTempo <code>BigDecimal</code> - variacao (intervalo) de tempo relacionado ao deslocamento de um movel
	 * @return velocidade media <code>BigDecimal</code>
	 */
	public static final BigDecimal calcularVariacaoEspaco(BigDecimal velocidadeMedia, BigDecimal variacaoTempo) {
		return (velocidadeMedia.multiply(variacaoTempo));
	}
}
