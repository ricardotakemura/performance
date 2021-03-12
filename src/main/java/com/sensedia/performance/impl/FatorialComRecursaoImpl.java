package com.sensedia.performance.impl;

import com.sensedia.performance.Fatorial;

public class FatorialComRecursaoImpl implements Fatorial {

	public long fatorial(int number) {
		return number < 1 ? 0l : number == 1 ? 1l : fatorial(number - 1) * number;
	}

	@Override
	public String toString() {
		return "Fatorial com recursao";
	}

}
