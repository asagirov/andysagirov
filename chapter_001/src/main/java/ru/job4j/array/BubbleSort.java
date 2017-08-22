package ru.job4j.array;
/**
 * Class BubbleSort программа для сортировки массива методом перестановки.
 * @author Andrey Sagirov (mailto:andrey.sagirov23@gmail.com)
 * @version $Id$
 * @since 22.08.2017
 */
public class BubbleSort {
	/**
	* @param array массив.
	* @return .
	*/
	public int[] sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] < array[i++]) {
			/**
			* @param pusir - отсортированный массив.
			*/
				int pusir = array[i];
				array[i] = array[i++];
				array[i++] = pusir;
			}
		}
		return array;
	}
}