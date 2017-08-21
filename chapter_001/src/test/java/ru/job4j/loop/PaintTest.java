package ru.job4j.loop;
/**
 * Тест класса Paint.
 */
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * PaintTest строит пирамиду в псевдографике.
 */
public class PaintTest {
	/**
	* @Test для проверки 1.
	*/
    @Test
	/**
	* @Test для проверки пирамиды высотой 2.
	*/
    public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
        Paint paint = new Paint();
        String result = paint.piramid(2);
        String expected = String.format(" ^ %s^^^", System.getProperty("line.separator"));
        assertThat(result, is(expected));
    }
	/**
	* @Test для проверки 2.
	*/
    @Test
	/**
	* @Test для проверки пирамиды высотой 3.
	*/
    public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
        Paint paint = new Paint();
        String result = paint.piramid(3);
        String expected = String.format(" ^ %s ^^^ %s^^^^^", System.getProperty("line.separator"));
        assertThat(result, is(expected));
    }
}