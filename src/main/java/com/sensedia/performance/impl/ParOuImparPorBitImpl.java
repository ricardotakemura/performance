package com.sensedia.performance.impl;

import com.sensedia.performance.ParOuImpar;

public class ParOuImparPorBitImpl implements ParOuImpar {

	public boolean ehPar(int number) {
		return (number & 1) == 0;
	}

	@Override
	public String toString() {
		return "Par ou impar por operacao de bit";
	}

}
