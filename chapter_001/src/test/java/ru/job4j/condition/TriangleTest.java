package ru.job4j.condition;

import static org.hamcrest.number.IsCloseTo.closeTo;
import org.junit.Test;
import static org.junit.Assert.assertThat;

/**
 * Тест класса class Triangle.
 */
public class TriangleTest {

/**
 * Тест класса whenAreaSetThreePointsThenTriangleArea.
 */
 @Test
 public void whenAreaSetThreePointsThenTriangleArea() {
    /**
	* создаем три объекта класса Point.
	* @param a - .
	* @param b - .
	* @param c - .
	*/
    Point a = new Point(0, 0);
    Point b = new Point(0, 2);
    Point c = new Point(2, 0);
    // Создаем объект треугольник и передаем в него объекты точек.
	/**
	* trianle - .
	*/
    Triangle triangle = new Triangle(a, b, c);
    /**
	* result Вычисляем площадь.
	*/
	double result = triangle.area();
	/**
	* expected Задаем ожидаемый результат..
	*/
    double expected = 2D;
    /**
	*Проверяем результат и ожидаемое значение.
	*/
    assertThat(result, closeTo(expected, 0.1));
 }
 }