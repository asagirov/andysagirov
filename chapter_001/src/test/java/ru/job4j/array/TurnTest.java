package ru.job4j.array;
/**
 * Тест класса Turn.
 */
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * TurnTest Перевернуть массив.
 */
public class TurnTest {
	/**
	* @Test для проверки 1.
	*/
    @Test
	/**
	* @Test для проверки массива из 4 элементов.
	*/
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
		Turn turn = new Turn();
		int[] array = {2, 6, 1, 4};
		int[] result = turn.back(array);
		int[] expected = {4, 1, 6, 2};
		assertThat(result, is(expected));
    }
	/**
	* @Test для проверки 2.
	*/
    @Test
	/**
	* @Test для проверки массива из 5 элементов.
	*/
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
		Turn turn = new Turn();
		int[] array = {1, 2, 3, 4, 5};
		int[] result = turn.back(array);
		int[] expected = {5, 4, 3, 2, 1};
		assertThat(result, is(expected));
    }
}