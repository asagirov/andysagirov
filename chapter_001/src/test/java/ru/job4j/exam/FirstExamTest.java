package ru.job4j.exam;
/**
 * Тест класса FirstExam.
 */
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * FirstExamTest Сложить массивы.
 */
public class FirstExamTest {
	/**
	* @Test для проверки 1.
	*/
    @Test
	/**
	* @Test для проверки массива из 4 элементов.
	*/
    public void whenFirstAndSecondHaveFourElements() {
		FirstExam proba = new FirstExam();
		int[] first = {1, 3, 5, 7};
		int[] second = {2, 4, 6, 8};
		int[] result = proba.united(first, second);
		int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
		assertThat(result, is(expected));
	}
	/**
	* @Test для проверки 2.
	*/
    @Test
	/**
	* @Test для проверки массива из 2 и 4 элементов.
	*/
    public void whenFirstAndSecondHaveTwoAndFourElements() {
		FirstExam proba = new FirstExam();
		int[] first = {1, 5};
		int[] second = {2, 3, 4};
		int[] result = proba.united(first, second);
		int[] expected = {1, 2, 3, 4, 5};
		assertThat(result, is(expected));
	}
	/**
	* @Test для проверки 3.
	*/
    @Test
	/**
	* @Test для проверки массива из 4 и 0 элементов.
	*/
    public void whenFirstAndSecondHaveFourAndNullElements() {
		FirstExam proba = new FirstExam();
		int[] first = {1, 3, 5, 7};
		int[] second = null;
		int[] result = proba.united(first, second);
		int[] expected = {1, 3, 5, 7};
		assertThat(result, is(expected));
	}
	/**
	* @Test для проверки 3.
	*/
    @Test
	/**
	* @Test для проверки массива из 4 и 4 элементов.
	*/
    public void whenFirstAndSecondHaveFourAndFourWithDublicateElements() {
		FirstExam proba = new FirstExam();
		int[] first = {1, 3, 5, 7};
		int[] second = {1, 2, 5, 6};
		int[] result = proba.united(first, second);
		int[] expected = {1, 1, 2, 3, 5, 5, 6, 7};
		assertThat(result, is(expected));
	}
}