package ru.job4j.calculator;

/**
*Class Класс для вычисления простых арифметических выражений(+,-,/,*).
*@author andysagirov
*since 15.08.2017
*/
public class Calculator {
	/**
	*
	*/
	private double result;
	/**
	*Сложение first и double.
	*@param first первое число.
	*@param second второе число.
	*/
	public void add(double first, double second) {
		this.result = first + second;
		}

	/**
	*Вычитание first и double.
	*@param first первое число.
	*@param second второе число.
	*/
	public void subtract(double first, double second) {
		this.result = first - second;
	}
	/**
	*Деление first и double.
	*@param first первое число.
	*@param second второе число.
	*/
	public void div(double first, double second) {
		this.result = first / second;
	}
	/**
	*Умножение first и double.
	*@param first первое число.
	*@param second второе число.
	*/
	public void multiple(double first, double second) {
		this.result = first * second;
	}
	/**
	*Результат арифметического вычисления.
	*@return result.
	*/
	public double getResult() {
		return this.result;
		}
}