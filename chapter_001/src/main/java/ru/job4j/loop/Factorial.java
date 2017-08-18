package ru.job4j.loop;
/**
 * Class Factorial Подсчет фактрориала.
 * @author Andrey Sagirov (mailto:andrey.sagirov23@gmail.com)
 * @version $Id$
 * @since 18.08.2017
 */

public class Factorial {
	/**
	* @param n - число.
	* @return fact - факториал.
	*/
	public int calc(int n) {
		int fact = 1;
		for (; fact <= n; fact++) {
			if (n == 0) {
				fact = 1;
			}
			fact = fact * fact++;
		}
		return fact;
	}
}