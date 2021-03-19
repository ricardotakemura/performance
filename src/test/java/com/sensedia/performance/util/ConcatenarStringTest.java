package com.sensedia.performance.util;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.sensedia.performance.ConcatenarString;
import com.sensedia.performance.impl.ConcatenarStringComFormat;
import com.sensedia.performance.impl.ConcatenarStringComMais;
import com.sensedia.performance.impl.ConcatenarStringComStringBuilder;

@RunWith(Parameterized.class)
public class ConcatenarStringTest {

	private ConcatenarString concatenarString;

	public ConcatenarStringTest(ConcatenarString concatenarString) {
		this.concatenarString = concatenarString;
	}

	@Parameters
	public static List<ConcatenarString> obterParametro() {
		return Arrays.asList(new ConcatenarStringComFormat(), new ConcatenarStringComStringBuilder(), new ConcatenarStringComMais());
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
