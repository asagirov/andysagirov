package ru.job4j.loop;
/**
 * Class Paint строит пирамиду в псевдографике.
 * @author Andrey Sagirov (mailto:andrey.sagirov23@gmail.com)
 * @version $Id$
 * @since 21.08.2017
 */
public class Paint {
	/**
	* StringBuilder - строит строку в одно целое.
	*/
	private StringBuilder builder = new StringBuilder();
	/**
	* piramid - параметры пирамиды.
	* @param h - высота пирамииды.
	* @return - строка целиком.
	*/
	public String piramid(int h) {
	/**
	* @param i - строка.
	* @param j - столбец.
	* @param width - ширина в зависимоти от высоты пирамиды.
	*/
		int i = 1;
		int j = 1;
		int width = h * 2 - 1;
		for (i = 1; i <= width; i++) {
			for (j = 1; j <= h; j++) {
				if (((j < h) && (i == 1)) || ((j < h) && (i == width))) {
					builder.append(" ");
				} else {
					builder.append("^");
				}
				if (j != h && i == width) {
					builder.append("\r\n");
				}
			}
		}
		System.out.print(builder);
		return builder.toString();
	}
}