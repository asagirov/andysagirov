package ru.job4j.loop;
/**
 * Тест класса Factorial.
 */
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * FactorialTest нахождения суммы в диапозоне.
 */
public class FactorialTest {
	/**
	*@Test .
	*/
    @Test
	/**
	* Проверка факториала 5 равно 120.
	*/
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial testFact = new Factorial();
		int result = testFact.calc(5);
		assertThat(result, is(120));
    }
	/**
	* Проверка факториала 0 равно 1.
	*/
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int result = testFact.calc(0);
		assertThat(result, is(1));
    }
}