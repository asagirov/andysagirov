package ru.job4j.exam;
/**
 * Тест класса SecondTest.
 */
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * SecondTestTest Сложить массивы.
 */
public class SecondTestTest {
	/**
	* @Test для проверки 1.
	*/
    @Test
	/**
	* @Test для проверки массива из 4 элементов.
	*/
    public void whenFirstAndSecondHaveFourElements() {
		SecondTest proba = new SecondTest();
		int[] first = {1, 3, 5, 7};
		int[] second = {2, 4, 6, 8};
		int[] result = proba.united(first, second);
		int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
		assertThat(result, is(expected));
	}
}