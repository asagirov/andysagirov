package ru.job4j.models;
/**
 * Class Engineer дочерний класс.
 * @author Andrey Sagirov (mailto:andrey.sagirov23@gmail.com)
 * @version $Id$
 * @since 19.09.2017
 */
public class Engineer extends Proffesion {
	/**
	* @param name имя.
	* @param education образование.
	* @param sex пол.
	*/
	public Engineer(String name, String education, String sex) {
		super(name, education, sex);
	}
	/**
	* разработка проэкта.
	*/
	public void development() {
	}
}