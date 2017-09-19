package ru.job4j.models;
/**
 * Class Teacher дочерний класс.
 * @author Andrey Sagirov (mailto:andrey.sagirov23@gmail.com)
 * @version $Id$
 * @since 19.09.2017
 */
public class Teacher extends Proffesion {
		/**
	* @param students обучение студентов.
	* @return текст.
	*/
	public String teach(Students students) {
		return profession.getEducation + " " + profession.getName + " учит студентов из группы " + students.getGroupName;
	}
	/**
	* @param students экзамен студентов.
	* @return текст.
	*/
	public String exam(Students students) {
		return profession.getName + " принимает экзамены у группы " + students.getGroupName;
	}
	/**
	* @param students факультатив студентов.
	* @return текст.
	*/
	public String elective(Students students) {
		return profession.getName + " проводит факультатив для группы " + students.getGroupName;
	}
}