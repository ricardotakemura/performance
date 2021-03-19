package com.sensedia.performance.impl;

import java.security.InvalidParameterException;

import com.sensedia.performance.InversaoNumero;

public class InversaoNumeroStringBuilderImpl implements InversaoNumero {

	public int inverter(int numero) {
		if (numero < 0) {
			throw new InvalidParameterException();
		}
		return Integer.parseInt(new StringBuilder().append(numero)
				.reverse().toString(), 10);
	}

	@Override
	public String toString() {
		return "Inversao do numero por StringBuilder";
	}

}
