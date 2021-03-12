package com.sensedia.performance.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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
		for (int i = 10000000; i > 0; i--) {
			Assert.assertTrue(lista.add(i));
		}
		final long fim = System.currentTimeMillis();
		System.out.printf("Teste de insercao na classe %s. Tempo de execucao: %dms\n", lista.getClass().getName(), fim - inicio);
	}

	@Test
	public void test2DePerformanceListagem() {
		final long inicio = System.currentTimeMillis();
		Integer value = 10000000;
		for (Iterator<Integer> i = lista.iterator(); i.hasNext();) { 
			Assert.assertEquals(value, i.next());
			value--;
		}
		final long fim = System.currentTimeMillis();
		System.out.printf("Teste de listagem na classe %s. Tempo de execucao: %dms\n", lista.getClass().getName(), fim - inicio);
	}

	@Test
	public void test3DePerformanceBusca() {
		final long inicio = System.currentTimeMillis();
		for (Integer i = 100000; i > 0; i--) {
			Assert.assertEquals(i, lista.get(10000000 - i));
		}		
		final long fim = System.currentTimeMillis();
		System.out.printf("Teste de busca na classe %s. Tempo de execucao: %dms\n", lista.getClass().getName(), fim - inicio);
	}

	@Test
	public void test4DePerformanceRemover() {
		final long inicio = System.currentTimeMillis();
		for (Integer i = 100; i > 0; i--) {
			Assert.assertTrue(lista.remove(i));
		}	
		final long fim = System.currentTimeMillis();
		System.out.printf("Teste de remocao na classe %s. Tempo de execucao: %dms\n", lista.getClass().getName(), fim - inicio);
	}
}
