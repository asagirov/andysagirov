package ru.job4j.loop;
/**
 * Тест класса Board.
 */
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * BoardTest строит шахматную доску в псевдографике.
 */
 public class BoardTest {
	/**
	* @Test для проверки.
	*/
    @Test
	/**
	* Проверка доски 3 на 3.
	*/
    public void whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
        Board board = new Board();
        String result = board.paint(3, 3);
        final String line = System.getProperty("line.separator");
        String expected = String.format("x x%s x %sx x%s", line, line, line);
        assertThat(result, is(expected));
 }
	/**
	* @Test 2.
	*/
    @Test
		/**
	* Проверка доски 5 на 4.
	*/
    public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {
        Board board = new Board();
        String result = board.paint(5, 4);
        final String line = System.getProperty("line.separator");
        String expected = String.format("x x x%s x x %sx x x%s x x %s", line, line, line, line);
        assertThat(result, is(expected));
    }
}