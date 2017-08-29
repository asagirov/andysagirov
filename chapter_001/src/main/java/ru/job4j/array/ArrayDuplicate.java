package ru.job4j.array;

import java.util.Arrays;

/**
 * Class for removing duplicates in an array.
 * @author Andrey Sagirov
 * @since 26.08.2017
 * @version 1.0
 */
public class ArrayDuplicate {
	/**
	 * Method for removing duplicates in an array.
	 * @param array array
	 * @return result
	 */
	public String[] remove(String[] array) {
		int n = array.length;
		for (int index = 0; index < n - 1; index++) {
			int x = index + 1;
			while (x < n) {
				if (array[index].equals(array[x])) {
					// Дубликат перемещаем в конец массива
					array[x] = array[n - 1];
					// Обрезаем длину массива
					n--;
				} else {
					x++;
				}
			}
		}
		return Arrays.copyOf(array, n);
	}
}