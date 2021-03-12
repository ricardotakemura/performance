package com.sensedia.performance;

public final class ExcecaoOuRetorno {

	public static void somenteNumerosNaturaisExcecao(int numero) throws Exception {
		if (numero < 0) {
			throw new Exception();
		}
	}

	public static boolean somenteNumerosNaturaisRetorno(int numero) {
		if (numero < 0) {
			return false;
		} else {
			return true;
		}
	}

}
