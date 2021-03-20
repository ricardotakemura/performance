package com.sensedia.performance.impl;

import com.sensedia.performance.ConcatenacaoString;

public class ConcatenacaoStringComFormatImpl implements ConcatenacaoString {

	public String concatenar(String s1, String s2) {
		return String.format("%s%s", s1, s2);
	}
	
	@Override
	public String toString() {
		return "Concatenar String com format";
	}

}
