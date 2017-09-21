package ru.job4j.tracker;
/**
 * Class Item поля заявок.
 * @author Andrey Sagirov (mailto:andrey.sagirov23@gmail.com)
 * @version $Id$
 * @since 21.09.2017
 */
public class Item {
	private String id;
	public String name;
	public String desc;
	public long create;
	public String comments;
	public Item(String name, String desc, long create, String comments) {
		this.name = name;
		this.desc = desc;
		this.create = create;
		this.comments = comments;
	}
	public String getName() {
		return this.name;
	}
	public String getDesc() {
		return this.desc;
	}
	public long getCreate() {
		return this.create;
	}
	public String getComments() {
		return this.comments;
	}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
}