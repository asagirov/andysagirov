package ru.job4j.max;

/**
 * Тест класса Point.
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест.
 */


public class PointTest {
	/**
	* @Test для проверки.
	*/
    @Test
    public void whenPointOnLineThenTrue() {
        //create of new point.
        Point a = new Point(1, 1);
        // execute method - is and get result;
        boolean rsl = a.is(0, 1);
        // assert result by excepted value.
        assertThat(rsl, is(true));
   }
}
