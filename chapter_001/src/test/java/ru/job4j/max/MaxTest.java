package ru.job4j.max;

/**
 * Тест класса Max.
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * MaxTest нахождения максимального числа из двух.
 */

public class MaxTest {
	/**
	* @Test для проверки.
	*/
	@Test
	/**
	* Проверка когда 2-е число макс.
	*/
public void whenFirstIsMaximum() {
    Max maximum = new Max();
    int result = maximum.max(4, 15, 10);
    assertThat(result, is(15));
}
/**
	* Проверка когда 1-е число макс.
	*/
public void whenFirstIsMaximum() {
    int result = maximum.max(12, 0, 11);
    assertThat(result, is(12));
}
/**
	* Проверка когда 3-е число макс.
	*/
public void whenThirdIsMaximum() {
    int result = maximum.max(29, -44, 34);
    assertThat(result, is(34));
}
}