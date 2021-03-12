package com.sensedia.performance.util;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.sensedia.performance.Fatorial;
import com.sensedia.performance.impl.FatorialComForImpl;
import com.sensedia.performance.impl.FatorialComRecursaoImpl;

@RunWith(Parameterized.class)
public class FatorialTest {
	
	private Fatorial fatorial;
	
	public FatorialTest(Fatorial fatorial) {
		this.fatorial = fatorial;
	}
	
	@Parameters
	public static List<Fatorial> obterParametro() {
		return Arrays.asList(new FatorialComForImpl(), new FatorialComRecursaoImpl());
	}

	@Test
	public void testeDePerformance() {
		final long inicio = System.currentTimeMillis();
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			Assert.assertEquals(3628800, fatorial.fatorial(10));
		}
		final long fim = System.currentTimeMillis();
		System.out.printf( "%s. Tempo de execucao: %dms\n", fatorial, fim - inicio);
	}

}
