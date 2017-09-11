package ru.job4j.exam;
/**
 * Class FirstExam соединяет 2 отсортированных массива.
 * @author Andrey Sagirov (mailto:andrey.sagirov23@gmail.com)
 * @version $Id$
 * @since 08.09.2017
 */
public class FirstExam {
	/**
	* @param first массив.
	* @param second массив.
	* @return third.
	*/
	public int[] united(int[] first, int[] second) {
		if (first == null) {
		return second;
		}
		if (second == null) {
		return first;
		}
		int[] third = new int[first.length + second.length];
		for (int i = 0; i < third.length / 2; i++) {
			if (first[i] <= second[i]) {
				third[i * 2] = first[i];
				third[i * 2 + 1] = second[i];
			} else {
				third[i * 2] = second[i];
				third[i * 2 + 1] = first[i];
			}
		}
		for (int i = 0; i < third.length - 1; i++) {
			/**
			* @param return.
			*/
			int result = third[i];
			if (third[i] >= third[i + 1]) {
				third[i] = third [i + 1];
				third[i + 1] = result;
			}
		}
	return third;
	}
}