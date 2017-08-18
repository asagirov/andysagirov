package ru.job4j.loop;
/**
 * Class Counter Подсчет суммы чётных чисел в диапазоне.
 * @author Andrey Sagirov (mailto:andrey.sagirov23@gmail.com)
 * @version $Id$
 * @since 18.08.2017
 */

public class Counter {
	/**
	* @param start - начало чисел.
	* @param finish - конец чисел.
	* int summa - сумма всех четных чисел.
	* @return summa.
	*/
	public int add(int start, int finish) {
		int summa = 0;
		for (start = 0; start <= finish; start++) {
			if (start % 2 == 0) {
				summa = summa + start;
			}
		}
		return summa;
	}
}