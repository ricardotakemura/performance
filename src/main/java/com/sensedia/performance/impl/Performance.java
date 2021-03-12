package com.sensedia.performance.impl;

public final class Performance {

	public static int binarySearch(int[] array, int value) {
		int start = 0;
		int end = array.length - 1;
		while (start <= end) {
			int middle = (start + end) / 2;
			if (array[middle] == value) {
				return middle;
			} else if (value < array[middle]) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}
		}
		return -1;
	}

	public static int average(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum / array.length;
	}

	public static void bubbleSort(int[] array) {
		int lastIndex = array.length - 1;
		boolean changed = false;
		do {
			changed = false;
			for (int i = 0; i < lastIndex; i++) {
				if (array[i] > array[i + 1]) {
					int aux = array[i];
					array[i] = array[i + 1];
					array[i + 1] = aux;
					changed = true;
				}
			}
			lastIndex--;
		} while (changed);
	}

	public static int fibonacci(int number) {
		if (number < 0) {
			throw new IllegalArgumentException("Invalid value");
		} else if (number < 2) {
			return number;
		}
		return fibonacci(number - 1) + fibonacci(number - 2);
	}

}
