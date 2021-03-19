package com.sensedia.performance.impl;

import com.sensedia.performance.ParOuImpar;

public class ParOuImparPorModuloImpl implements ParOuImpar {

	public boolean ehPar(int numero) {
		return numero % 2 == 0;
	}

	@Override
	public String toString() {
		return "Par ou impar por operacao de modulo";
	}

}
