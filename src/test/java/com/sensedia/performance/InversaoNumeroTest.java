package com.sensedia.performance;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.sensedia.performance.InversaoNumero;
import com.sensedia.performance.impl.InversaoNumeroDivisaoImpl;
import com.sensedia.performance.impl.InversaoNumeroStringBuilderImpl;
import com.sensedia.performance.impl.InversaoNumeroStringImpl;

@RunWith(Parameterized.class)
public class InversaoNumeroTest {

	private InversaoNumero inversaoNumero;

	public InversaoNumeroTest(InversaoNumero inversaoNumero) {
		this.inversaoNumero = inversaoNumero;
	}

	@Parameters
	public static List<InversaoNumero> obterParametro() {
		return Arrays.asList(new InversaoNumeroStringImpl(), new InversaoNumeroStringBuilderImpl(), new InversaoNumeroDivisaoImpl());
	}

	@Test
	public void testDePerformance() {
		final long inicio = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			Assert.assertEquals(987654321, inversaoNumero.inverter(123456789));
		}
		final long fim = System.currentTimeMillis();
		System.out.printf( "%s. Tempo de execucao: %dms\n", inversaoNumero, fim - inicio);
	}
}
