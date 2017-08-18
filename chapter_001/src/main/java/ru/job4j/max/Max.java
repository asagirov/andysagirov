package ru.job4j.max;
/**
 *Class Max.
 *@author Andrey Sagriov
 *@version $Id$
 *@since 0.1
 */
public class Max {
/**
 *@param first - первое число.
 *@param second - второе число.
 *@return максимальное число.
 */
    public int max(int first, int second) {
       return first > second ? first : second;
    }
	public int max(int first, int second, int third) {
       return Math.max (first, second, third);
}