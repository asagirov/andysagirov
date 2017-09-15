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
		int firstIndex = 0;
		int secondIndex = 0;
		for (int i = 0; i < third.length; i++) {
			if (firstIndex >= first.length) {
				third[i] = second[secondIndex];
				secondIndex++;
			} else if (secondIndex >= second.length) {
				third[i] = first[firstIndex];
				firstIndex++;
			} else if (first[firstIndex] < second[secondIndex]) {
				third[i] = first[firstIndex];
				firstIndex++;
				} else if (first[firstIndex] > second[secondIndex]) {
					third[i] = second[secondIndex];
					secondIndex++;
					} else {
				third[i] = first[firstIndex];
				third[i + 1] = second[secondIndex];
				i = i + 1;
				firstIndex++;
				secondIndex++;
			}
		}
	return third;
	}
}