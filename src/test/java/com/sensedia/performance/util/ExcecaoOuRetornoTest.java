package com.sensedia.performance.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.sensedia.performance.impl.ExcecaoOuRetorno;

@RunWith(JUnit4.class)
public class ExcecaoOuRetornoTest {

	private static final int MAX_VALUE = -1;
	private static final int MIN_VALUE = -1000000;
	
	@Test
	public void testeDePerformanceComExcecao() {
		final long inicio = System.currentTimeMillis();		
		for (int i = MAX_VALUE; i > MIN_VALUE; i--) {
			try {
				ExcecaoOuRetorno.somenteNumerosNaturaisExcecao(i);
				Assert.fail();
			} catch (Exception e) {}
		}
		final long fim = System.currentTimeMillis();
		System.out.printf("testeDePerformanceComExcecao. Tempo de execucao: %dms\n", fim - inicio);		
	}

	@Test
	public void testeDePerformanceComRetorno() {
		final long inicio = System.currentTimeMillis();		
		for (int i = MAX_VALUE; i > MIN_VALUE; i--) {
			if (ExcecaoOuRetorno.somenteNumerosNaturaisRetorno(i)) {
				Assert.fail();
			}
		}
		final long fim = System.currentTimeMillis();
		System.out.printf("testeDePerformanceComRetorno. Tempo de execucao: %dms\n", fim - inicio);		
	}

}
