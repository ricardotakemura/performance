package com.sensedia.performance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ListTest {

	private static final int MAX_VALUE = 1000000;
	
	public List<Integer> lista;
	
	public ListTest(List<Integer> lista) {
		this.lista = lista;
	}
	
	@Parameters
	public static List<?> obterParametro() {
		return Arrays.asList(new ArrayList<Integer>(), new Vector<Integer>(), new LinkedList<Integer>());
	}

	@Test
	public void test1DePerformanceInsercao() {
		final long inicio = System.currentTimeMillis();
		for (int i = MAX_VALUE; i > 0; i--) {
			Assert.assertTrue(lista.add(i));
		}
		final long fim = System.currentTimeMillis();
		System.out.printf("Teste de insercao na classe %s. Tempo de execucao: %dms\n", lista.getClass().getName(), fim - inicio);
	}

	@Test
	public void test2DePerformanceListagem() {
		final long inicio = System.currentTimeMillis();
		Integer value = MAX_VALUE;
		for (Integer i: lista) { 
			Assert.assertEquals(value, i);
			value--;
		}
		final long fim = System.currentTimeMillis();
		System.out.printf("Teste de listagem na classe %s. Tempo de execucao: %dms\n", lista.getClass().getName(), fim - inicio);
	}

	@Test
	public void test3DePerformanceBusca() {
		final long inicio = System.currentTimeMillis();
		for (Integer i = 100000; i > 0; i--) {
			Assert.assertEquals(i, lista.get(MAX_VALUE - i));
		}		
		final long fim = System.currentTimeMillis();
		System.out.printf("Teste de busca na classe %s. Tempo de execucao: %dms\n", lista.getClass().getName(), fim - inicio);
	}

	@Test
	public void test4DePerformanceRemover() {
		final long inicio = System.currentTimeMillis();
		for (Integer i = 1000; i > 0; i--) {
			Assert.assertTrue(lista.remove(i));
		}	
		final long fim = System.currentTimeMillis();
		System.out.printf("Teste de remocao na classe %s. Tempo de execucao: %dms\n", lista.getClass().getName(), fim - inicio);
	}
}
