package ru.job4j.max;

/**
 * Тест класса Max.
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест нахождения максимального числа из двух.
 */

public class MaxTest {
	/**
	* @Test для проверки.
	*/
	@Test
public void whenFirstLessSecond() {
    Max maximum = new Max();
    int result = maximum.max(4, 15);
    assertThat(result, is(15));
}
/**
	* Проверка когда 1-ое число больше 2-го.
	*/
public void whenSecondLessFirst() {
    int result = maximum.max(12, 0);
    assertThat(result, is(12));
}
}