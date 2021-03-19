package com.sensedia.performance.impl;

import com.sensedia.performance.Fatorial;

public class FatorialComForImpl implements Fatorial {

	public long fatorial(int numero) {
		if (numero < 1) {
			return 0l;
		}
		long result = 1l;
		for (int i = numero; i > 1; i--) {
			result = result * i;
		}
		return result;
	}

	@Override
	public String toString() {
		return "Fatorial com for";
	}

}
