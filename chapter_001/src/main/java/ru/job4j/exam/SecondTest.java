package ru.job4j.exam;
/**
 * Class SecondTest соединяет 2 отсортированных массива.
 * @author Andrey Sagirov (mailto:andrey.sagirov23@gmail.com)
 * @version $Id$
 * @since 08.09.2017
 */
public class SecondTest {
	/**
	* @param first массив.
	* @param second массив.
	* @return third.
	*/
	public int[] united(int[] first, int[] second) {
		int[] third = new int[first.length + second.length];
		for (int i = 0; i < third.length / 2; i++) {
			if (first[i] < second[i]) {
				third[i * 2] = first[i];
				third[i * 2 + 1] = second[i];
			} else {
				third[i * 2] = second[i];
				third[i * 2 + 1] = first[i];
			}
		}
	return third;
	}
}