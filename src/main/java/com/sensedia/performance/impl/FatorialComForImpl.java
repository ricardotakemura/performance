package com.sensedia.performance.impl;

import com.sensedia.performance.Fatorial;

public class FatorialComForImpl implements Fatorial {

	public long fatorial(int number) {
		if (number < 1) {
			return 0l;
		}
		long result = 1l;
		for (int i = number; i > 1; i--) {
			result = result * i;
		}
		return result;
	}

	@Override
	public String toString() {
		return "Fatorial com for";
	}

}
