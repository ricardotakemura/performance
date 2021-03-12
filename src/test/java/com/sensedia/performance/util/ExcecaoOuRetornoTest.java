package com.sensedia.performance.util;

import org.junit.Assert;
import org.junit.Test;

import com.sensedia.performance.ExcecaoOuRetorno;

public class ExcecaoOuRetornoTest {

	@Test
	public void testeDePerformanceComExcecao() {
		final long inicio = System.currentTimeMillis();		
		for (int i = -1; i > -10000000; i--) {
			try {
				ExcecaoOuRetorno.somenteNumerosNaturaisExcecao(i);
				Assert.fail();
			} catch (Exception e) {}
		}
		final long fim = System.currentTimeMillis();
		System.out.printf("testeComExcecao. Tempo de execucao: %dms\n", fim - inicio);		
	}

	@Test
	public void testeDePerformanceComRetorno() {
		final long inicio = System.currentTimeMillis();		
		for (int i = -1; i > -10000000; i--) {
			if (ExcecaoOuRetorno.somenteNumerosNaturaisRetorno(i)) {
				Assert.fail();
			}
		}
		final long fim = System.currentTimeMillis();
		System.out.printf("testeComRetorno. Tempo de execucao: %dms\n", fim - inicio);		
	}

}
