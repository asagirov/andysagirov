package ru.job4j.loop;
/**
 * Class Board строит шахматную доску в псевдографике.
 * @author Andrey Sagirov (mailto:andrey.sagirov23@gmail.com)
 * @version $Id$
 * @since 19.08.2017
 */
public class Board {
	/**
	* StringBuilder - строит строку в одно целое.
	*/
	private StringBuilder builder = new StringBuilder();
	/**
	* @param width - ширина.
	* @param height - высота.
	* int i - строка.
	* int j - столбец.
	* @return строка целиком.
	*/
	public String paint(int width, int height) {
		int i = 1;
		int j = 1;
		for (i = 1; i <= width; i++) {
			for (j = 1; j <= height; j++) {
				if ((i % 2 != 0 && j % 2 != 0) || (i % 2 == 0 && j % 2 == 0)) {
					builder.append("x");
				} else {
					builder.append(" ");
				}
				if (j == width) {
					builder.append("\r\n");
				}
		}
	}
	return builder.toString();
	}
}