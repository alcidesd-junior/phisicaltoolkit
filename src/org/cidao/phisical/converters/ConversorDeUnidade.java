/*
 *  ConversorDeUnidade.java v1.0 - conversor de unidades de medida
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
package org.cidao.phisical.converters;

import java.math.BigDecimal;

import org.cidao.phisical.converters.unidades.Comprimento;

public abstract class ConversorDeUnidade {
	
	public static final BigDecimal converter(Comprimento dimensaoDe, Comprimento dimensaoPara, BigDecimal valor) {
		
		if (dimensaoDe == dimensaoPara)
			return valor;
		else {
			BigDecimal fator = BigDecimal.ZERO;
			fator = BigDecimal.valueOf(dimensaoDe.getValor()/dimensaoPara.getValor());
				return valor.divide(fator, BigDecimal.ROUND_HALF_EVEN);
		}		
	}
	
}
