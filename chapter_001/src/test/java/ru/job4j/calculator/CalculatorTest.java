package ru.job4j.calculator;

/**
 * Тест класса Calculator.
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест сложения one plus one then two.
 */
public class CalculatorTest {
	/**
	*@Test тест для калькулятора.
	*/
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

/**
 * Тест вычитания one minus one then zero.
 */
    public void whenSubstractOneMinusOnethenZero() {
        Calculator calc = new Calculator();
        calc.subtract(1D, 1D);
        double result = calc.getResult();
        double expected = 0D;
        assertThat(result, is(expected));
    }

/**
 * Тест деление one div one then one.
 */
    public void whenDivOneDivisionOnethenOne() {
        Calculator calc = new Calculator();
        calc.div(1D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }

/**
 * Тест умножения one multiple one then one.
 */
    public void whenMultipleOneMultiplicationOnethenOne() {
        Calculator calc = new Calculator();
        calc.multiple(1D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
}