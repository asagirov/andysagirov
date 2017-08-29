package ru.job4j.array;
/**
 * Class RotateArray поворот массива по часовой стрелке.
 * @author Andrey Sagirov (mailto:andrey.sagirov23@gmail.com)
 * @version $Id$
 * @since 22.08.2017
 */
public class RotateArray {
	/**
	* @param array массив.
	* @return .
	*/
	public int[][] rotate(int[][] array) {
		int rot;
		for (int i = 0; i < array.length / 2; i++) {
			for (int j = i; j < array.length - i - 1; j++) {
				rot = array[i][j];
				array[i][j] = array[array.length - j - 1][i];
				array[array.length - j - 1][i] = array[array.length - i - 1][array.length - j - 1];
				array[array.length - i - 1][array.length - j - 1] = array[j][array.length - i - 1];
				array[j][array.length - i - 1] = rot;
			}
		}
		return array;
	}
}