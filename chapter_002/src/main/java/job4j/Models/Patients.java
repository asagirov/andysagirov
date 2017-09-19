package ru.job4j.models;
/**
 * Class Patients класс.
 * @author Andrey Sagirov (mailto:andrey.sagirov23@gmail.com)
 * @version $Id$
 * @since 19.09.2017
 */
public class Patients {
	/**
	* @param name имя.
	*/
	private String name;
	/**
	* @param complaints жалобы.
	*/
	private String complaints;
	/**
	* пациент.
	* @param name имя.
	* @param complaints жалобы.
	*/
	private Patients(String name, String complaints) {
		this.name = name;
		this.complaints = complaints;
	}
	/**
	* @return имя пациента.
	*/
	public String getName() {
		return this.name;
	}
	/**
	* @return жалобы пациента.
	*/
	public String getComplaints() {
		return this.complaints;
	}
}