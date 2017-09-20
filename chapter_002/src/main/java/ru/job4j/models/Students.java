package ru.job4j.models;
/**
 * Class Students класс.
 * @author Andrey Sagirov (mailto:andrey.sagirov23@gmail.com)
 * @version $Id$
 * @since 19.09.2017
 */
public class Students {
	/**
	* @param groupName название группы студентов.
	* @return .
	*/
	private String groupName;
	/**
	* @param groupName группа студентов.
	*/
	public Students(String groupName) {
		this.groupName = groupName;
	}
	/**
	* @return группа студентов.
	*/
	public String getGroupName() {
		return this.groupName;
	}
}