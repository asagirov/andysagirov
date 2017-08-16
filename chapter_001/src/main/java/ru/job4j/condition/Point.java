package ru.job4j.condition;

/**
 *Class Point.
 *@author Andrey Sagirov
 *@version $Id$
 *@since 0.1
 */

public class Point {
 /**
 *@param x - первое число.
 */
	private int x;
 /**
 *@param y - второе число.
 */
	private int y;
 /**
 *@param x - первое число.
 *@param y - второе число.
 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
/**
 *@return x.
 */
	public int getX() {
		return this.x;
	}

/**
 *@return y.
 */
	public int getY() {
		return this.y;
	}
/**
 *@param a число а.
 *@param b число б.
 *@return result.
 */
	public boolean is(int a, int b) {
		return this.y == a * this.x + b;
	}
}