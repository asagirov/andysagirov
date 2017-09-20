package ru.job4j.models;
/**
 * Class Doctor дочерний класс.
 * @author Andrey Sagirov (mailto:andrey.sagirov23@gmail.com)
 * @version $Id$
 * @since 19.09.2017
 */
public class Doctor extends Proffesion {
	/**
	* @param name имя.
	* @param education образование.
	* @param sex пол.
	*/
	public Doctor(String name, String education, String sex) {
		super(name, education, sex);
	}
	/**
	* @param patients лечение пациента.
	* @return текст.
	*/
	public String heal(Patients patients) {
		return this.getEducation() + " " + this.getName() + " лечит пациента " + patients.getName() + " у которого жалоба на" + patients.getComplaints();
	}
	/**
	* @param patients анализы пациента.
	* @return текст.
	*/
	public String tests(Patients patients) {
		return this.getName() + " берёт анализы у пациента " + patients.getName();
	}
}