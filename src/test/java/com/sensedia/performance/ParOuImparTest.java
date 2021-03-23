package com.sensedia.performance;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.sensedia.performance.impl.ParOuImparPorBitImpl;
import com.sensedia.performance.impl.ParOuImparPorModuloImpl;

@RunWith(Parameterized.class)
public class ParOuImparTest {
	
	private ParOuImpar parOuImpar;

	public ParOuImparTest(ParOuImpar parOuImpar) {
		this.parOuImpar = parOuImpar;
	}
	
	@Parameters
	public static List<ParOuImpar> obterParametro() {
		return Arrays.asList(new ParOuImparPorModuloImpl(), new ParOuImparPorBitImpl());
	}

	@Test
	public void testeDePerformanceParOuImpar() {
		final long inicio = System.currentTimeMillis();
		boolean result = true;
		for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
			Assert.assertEquals(result, parOuImpar.ehPar(i));
			result = !result;
		}
		final long fim = System.currentTimeMillis();
		System.out.printf("%s. Tempo de execucao: %dms\n", parOuImpar, fim - inicio);		
	}

}
