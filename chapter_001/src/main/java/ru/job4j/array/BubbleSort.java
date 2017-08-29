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
			for (int j = 1; j < (array.length - i); j++) {
				if (array[j - 1] > array[j]) {
					/**
					 * @param pusir - отсортированный массив.
					 */
					int pusir = array[j - 1];
					array[j - 1] = array[j];
					array[j] = pusir;
				}
			}
		}
		return array;
	}
}