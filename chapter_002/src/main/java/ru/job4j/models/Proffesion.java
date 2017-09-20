package ru.job4j.models;
/**
 * Class Profession родительский класс.
 * @author Andrey Sagirov (mailto:andrey.sagirov23@gmail.com)
 * @version $Id$
 * @since 19.09.2017
 */
public class Proffesion {
	/**
	* @param name имя.
	*/
	private String name;
	/**
	* @param education образование.
	*/
	private String education;
	/**
	* @param sex пол.
	*/
	private String sex;
	/**
	* @param name имя.
	* @param education образование.
	* @param sex пол.
	*/
	public Proffesion(String name, String education, String sex) {
		this.name = name;
		this.education = education;
		this.sex = sex;
	}
	/**
	* @return имя.
	*/
	public String getName() {
		return this.name;
	}
	/**
	* @return образование.
	*/
	public String getEducation() {
		return this.education;
	}
	/**
	* @return пол.
	*/
	public String getSex() {
		return this.sex;
	}
}