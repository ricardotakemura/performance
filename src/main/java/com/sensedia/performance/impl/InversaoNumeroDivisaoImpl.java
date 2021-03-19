package com.sensedia.performance.impl;

import java.security.InvalidParameterException;

import com.sensedia.performance.InversaoNumero;

public class InversaoNumeroDivisaoImpl implements InversaoNumero {

	public int inverter(int numero) {
		if (numero < 0) {
			throw new InvalidParameterException();
		}		
		int resultado = 0;
		while (numero > 0) {
			int resto = numero % 10;
			resultado = resultado * 10 + resto;
			numero = numero / 10;
		}
		return resultado;
	}

	@Override
	public String toString() {
		return "Inversao do numero por divisao";
	}
}
