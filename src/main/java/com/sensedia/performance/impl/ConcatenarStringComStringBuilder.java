package com.sensedia.performance.impl;

import com.sensedia.performance.ConcatenarString;

public class ConcatenarStringComStringBuilder implements ConcatenarString {

	public String concatenar(String s1, String s2) {
		return new StringBuilder(s1).append(s2).toString();
	}

	@Override
	public String toString() {
		return "Concatenar String com StringBuilder";
	}

}
