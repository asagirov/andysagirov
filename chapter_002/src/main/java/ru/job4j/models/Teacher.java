package ru.job4j.models;
/**
 * Class Teacher дочерний класс.
 * @author Andrey Sagirov (mailto:andrey.sagirov23@gmail.com)
 * @version $Id$
 * @since 19.09.2017
 */
public class Teacher extends Proffesion {
	/**
	* @param name имя.
	* @param education образование.
	* @param sex пол.
	*/
	public Teacher(String name, String education, String sex) {
		super(name, education, sex);
	}
	/**
	* @param students обучение студентов.
	* @return текст.
	*/
	public String teach(Students students) {
		return this.getEducation + " " + this.getName + " учит студентов из группы " + this.getGroupName;
	}
	/**
	* @param students экзамен студентов.
	* @return текст.
	*/
	public String exam(Students students) {
		return this.getName + " принимает экзамены у группы " + this.getGroupName;
	}
	/**
	* @param students факультатив студентов.
	* @return текст.
	*/
	public String elective(Students students) {
		return this.getName + " проводит факультатив для группы " + this.getGroupName;
	}
}