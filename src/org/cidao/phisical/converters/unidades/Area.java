/*
 *  Area.java v1.0
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

package org.cidao.phisical.converters.unidades;

public enum Area {

	QUILOMETRO_2(0.000001), 
	DECAMETRO_2(0.0001), 
	METRO_2(1), 
	DECIMETRO_2(100), 
	CENTIMETRO_2(10000),
	MILIMETRO_2(1000000);

	private final double valor;

	Area(double valor) { 
		this.valor = valor; 
	}

	public double getValor() {
		return valor;
	}

}
