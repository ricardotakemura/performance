package com.sensedia.performance.util;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;

import com.sensedia.performance.impl.Performance;

@RunWith(JUnit4.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PerformanceTest {
	
	private static final int MAX_VALUE = 1000000;
	private static final int[] ARRAY = new int[] {1,2,3,5,8,13,21,34,55,89,144};

	@Test
	public void test1ConstantComplexity() {
		int number = 8;
		final long inicio = System.currentTimeMillis();
		for (int i = 0; i < MAX_VALUE; i++) {			
			if (number % 2 == 0) {
				Assert.assertTrue(true);
			} else {
				Assert.fail();
			}
		}
		final long fim = System.currentTimeMillis();
		System.out.printf( "Constant complexity. Time: %dms\n", fim - inicio);
	}

	@Test
	public void test2LogarithmicComplexity() {
		final long inicio = System.currentTimeMillis();
		for (int i = 0; i < MAX_VALUE; i++) {
			Assert.assertEquals(9, Performance.binarySearch(ARRAY, 89));
		}
		final long fim = System.currentTimeMillis();
		System.out.printf( "Logarithmic complexity. Time: %dms\n", fim - inicio);
	}

	@Test
	public void test3LinearComplexity() {
		final long inicio = System.currentTimeMillis();
		for (int i = 0; i < MAX_VALUE; i++) {
			Assert.assertTrue(Performance.isPrimeNumber(19));
		}
		final long fim = System.currentTimeMillis();
		System.out.printf( "Linear complexity. Time: %dms\n", fim - inicio);
	}

	@Test
	public void test4QuadraticComplexity() {
		int[] input = new int[] {144,1,55,3,89,8,2,21,5,34,13};
		final long inicio = System.currentTimeMillis();
		for (int i = 0; i < MAX_VALUE; i++) {
			Performance.bubbleSort(input);
			Assert.assertArrayEquals(ARRAY, input);
		}
		final long fim = System.currentTimeMillis();
		System.out.printf("Quadratic complexity. Time: %dms\n", fim - inicio);
	}

	@Test
	public void test5ExponentialComplexity() {
		final long inicio = System.currentTimeMillis();
		for (int i = 0; i < MAX_VALUE; i++) {
			Assert.assertEquals(144, Performance.fibonacci(12));
		}
		final long fim = System.currentTimeMillis();
		System.out.printf( "Exponential complexity. Time: %dms\n", fim - inicio);
	}

}
