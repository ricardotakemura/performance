package com.sensedia.performance.impl;

import com.sensedia.performance.ConcatenacaoString;

public class ConcatenacaoStringComStringBuilderImpl implements ConcatenacaoString {

	public String concatenar(String s1, String s2) {
		return new StringBuilder(s1).append(s2).toString();
	}

	@Override
	public String toString() {
		return "Concatenar String com StringBuilder";
	}

}
