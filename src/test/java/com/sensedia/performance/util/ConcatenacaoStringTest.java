package com.sensedia.performance.util;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.sensedia.performance.ConcatenacaoString;
import com.sensedia.performance.impl.ConcatenacaoStringComFormatImpl;
import com.sensedia.performance.impl.ConcatenacaoStringComMaisImpl;
import com.sensedia.performance.impl.ConcatenacaoStringComStringBuilderImpl;

@RunWith(Parameterized.class)
public class ConcatenacaoStringTest {

	private ConcatenacaoString concatenarString;

	public ConcatenacaoStringTest(ConcatenacaoString concatenarString) {
		this.concatenarString = concatenarString;
	}

	@Parameters
	public static List<ConcatenacaoString> obterParametro() {
		return Arrays.asList(new ConcatenacaoStringComFormatImpl(), new ConcatenacaoStringComStringBuilderImpl(), new ConcatenacaoStringComMaisImpl());
	}
	
	@Test
	public void testeDePerformance() {
		final long inicio = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			Assert.assertEquals("Hello World!", concatenarString.concatenar("Hello ", "World!"));
		}
		final long fim = System.currentTimeMillis();
		System.out.printf( "%s. Tempo de execucao: %dms\n", concatenarString, fim - inicio);		
	}
}
