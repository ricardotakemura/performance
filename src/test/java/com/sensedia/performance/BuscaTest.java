package com.sensedia.performance;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.sensedia.performance.impl.BuscaPorHashImpl;
import com.sensedia.performance.impl.BuscaPorStreamImpl;
import com.sensedia.performance.impl.Usuario;

@RunWith(Parameterized.class)
public class BuscaTest {

	private Busca<String, Usuario> busca;
	
	public BuscaTest(Busca<String, Usuario> busca) {
		this.busca = busca;
	}
	
	@Parameters
	public static List<Busca<String, Usuario>> obterParametro() {
		return Arrays.asList(new BuscaPorHashImpl<String, Usuario>(), new BuscaPorStreamImpl<String, Usuario>());
	}

	@Test
	public void teste1DePerformanceAdicionar() {
		final long inicio = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			Assert.assertNotNull(busca.adicionar(new Usuario("andre_" + i, "senha" + i)));
		}
		final long fim = System.currentTimeMillis();
		System.out.printf( "%s - Adicao de valores. Tempo de execucao: %dms\n", busca, fim - inicio);
	}

	@Test
	public void teste2DePerformanceBuscar() {
		final long inicio = System.currentTimeMillis();
		for (int i = 10000; i > -1; i--) {
			Assert.assertEquals(new Usuario("andre_" + i, "senha" + i), busca.buscar("andre_" + i));
		}
		final long fim = System.currentTimeMillis();
		System.out.printf( "%s - Busca de valores. Tempo de execucao: %dms\n", busca, fim - inicio);
	}
}
