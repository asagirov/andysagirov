package ru.job4j.condition;

/**
 *class Triangle.
 *@author Andrey Sagirov
 *@version $Id$
 *@since 0.1
 */

public class Triangle {
/**
* точки для построения треугольника.
*/
private Point a;
/**
* точки для построения треугольника.
*/
private Point b;
/**
* точки для построения треугольника.
*/
private Point c;

/**
* Triangle -.
* @param a - a.
* @param b - b.
* @param c - c.
*/
   public Triangle(Point a, Point b, Point c) {
	   /**
	   * @param a - a.
	   * @param b - b.
	   * @param c - c.
	   */
       this.a = a;
       this.b = b;
       this.c = c;
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
* Метод должен вычислять расстояние между точками left и right.
*
* Для вычисления расстояния использовать формулу.
* √(xb - xa)^2 + (yb - ya)^2
*
* где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
*
* ^ - степень.
* @param left Точка слева
* @param right Точка с права.
* @return расстояние между точками left и right.
*/
	public double distance(Point left, Point right) {
    return Math.sqrt(Math.pow((this.x * left - this.x * right), 2) + Math.pow((this.y * right - this.y * left), 2));
}

/**
* Метод вычисления периметра по длинам сторон.
*
* Формула.
*
* (ab + ac + bc) / 2
*
* @param ab расстояние между точками a b
* @param ac расстояние между точками a c
* @param bc расстояние между точками b c
* @return Перимент.
*/
public double period(double ab, double ac, double bc) {
    return (ab + ac + bc) / 2;
}
/**
* Метод должен вычислить прощадь треугольканива.
*
* Формула.
*
* √ p *(p - ab) * (p - ac) * (p - bc)
*
* где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
*
* @return Вернуть прощадь, если треугольник существует или -1.
*/
public double area() {
    double rsl = -1;
    double ab = this.distance(this.a, this.b);
    double ac = this.distance(this.a, this.c);
    double bc = this.distance(this.b, this.c);
    double p = this.period(ab, ac, bc);
    if (this.exist(ab, ac, bc)) {
		rsl = Math.sqrt(this.petiod * (this.period - ab) * (this.period - ac) * (this.period + bc));
    } else {
		rsl = -1;
	}
    return rsl;
}

/**
* Метод проверяет можно ли построить треугольник с такими длинами сторон.
* @param ab Длина от точки a b.
* @param ac Длина от точки a c.
* @param bc Длина от точки b c.
* @return exist - true or false.
*/
private boolean exist(double ab, double ac, double bc) {
	if (ab > 0 && ac > 0 && bc > 0) {
		exist = true;
	} else {
		exist = false;
	}
   return exist;
}
}
