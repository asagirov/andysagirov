package ru.job4j.array;
/**
 * Тест класса RotateArray.
 */
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * RotateArrayTest поворот массива.
 */
public class RotateArrayTest {
	/**
	* @Test для проверки 1.
	*/
    @Test
	/**
	* Test для проверки массива 2x2.
	*/
	public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
		RotateArray povorot = new RotateArray();
		int[][] array = {{1, 2}, {3, 4}};
		int[][] result = povorot.rotate(array);
		int[][] expected = {{3, 1}, {4, 2}};
		assertThat(result, is(expected));
	}
	/**
	* @Test для проверки 2.
	*/
    @Test
	/**
	* Test для проверки массива 3x3.
	*/
	public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
		RotateArray povorot = new RotateArray();
		int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] result = povorot.rotate(array);
		int[][] expected = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
		assertThat(result, is(expected));
	}
}