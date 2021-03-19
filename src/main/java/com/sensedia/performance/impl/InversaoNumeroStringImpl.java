package com.sensedia.performance.impl;

import java.security.InvalidParameterException;

import com.sensedia.performance.InversaoNumero;

public class InversaoNumeroStringImpl implements InversaoNumero {

	public int inverter(int numero) {
		if (numero < 0) {
			throw new InvalidParameterException();
		}		
		String s = String.valueOf(numero),
			   r = "";
		for (char c: s.toCharArray()) {
			r = c + r;
		}
		return Integer.parseInt(r, 10);
	}

	@Override
	public String toString() {
		return "Inversao do numero por String";
	}

}
