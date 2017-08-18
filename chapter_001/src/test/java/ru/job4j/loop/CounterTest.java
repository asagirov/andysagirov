package ru.job4j.loop;
/**
 * Тест класса Counter.
 */
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * CounterTest нахождения суммы в диапозоне.
 */

public class CounterTest {
	/**
	* @Test для проверки.
	*/
    @Test
	/**
	* Проверка.
	*/
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
		Counter coun - new Counter();
		int result = coun.add(1, 10);
		assertThat(result, is(30));
	}
}
