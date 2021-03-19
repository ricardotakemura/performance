package com.sensedia.performance.impl;

import com.sensedia.performance.Fatorial;

public class FatorialComRecursaoImpl implements Fatorial {

	public long fatorial(int numero) {
		return numero < 1 ? 0l : numero == 1 ? 1l : fatorial(numero - 1) * numero;
	}

	@Override
	public String toString() {
		return "Fatorial com recursao";
	}

}
