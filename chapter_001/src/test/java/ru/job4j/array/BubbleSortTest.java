package ru.job4j.array;
/**
 * Тест класса BubbleSort.
 */
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * BubbleSortTest сортировка массива.
 */
public class BubbleSortTest {
	/**
	* @Test для проверки 1.
	*/
    @Test
	/**
	* Test для проверки массива из 5 элементов.
	*/
	public void whenArrayNeedSortWithFiveElements() {
		BubbleSort peresort = new BubbleSort();
		int[] array = {5, 1, 2, 7, 3};
		int[] result = peresort.sort(array);
		int[] expected = {1, 2, 3, 5, 7};
		assertThat(result, is(expected));
	}
}