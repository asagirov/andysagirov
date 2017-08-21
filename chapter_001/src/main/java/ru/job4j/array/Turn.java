package ru.job4j.array;
/**
 * Class Board строит шахматную доску в псевдографике.
 * @author Andrey Sagirov (mailto:andrey.sagirov23@gmail.com)
 * @version $Id$
 * @since 19.08.2017
 */
public class Turn {
	/**
	* @param array массив.
	* @return .
	*/
	public int[] back(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			/**
			* @param massiv - зеркальный массив.
			*/
			int massiv = array[i];
			array[i] = array.length - i - 1;
			array[array.length - i - 1] = massiv;
		}
		return array;
	}
}