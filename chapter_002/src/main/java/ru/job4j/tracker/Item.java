package ru.job4j.tracker;
/**
 * Class Item поля заявок.
 * @author Andrey Sagirov (mailto:andrey.sagirov23@gmail.com)
 * @version $Id$
 * @since 21.09.2017
 */
public class Item {
	/**
	* id - уникальный id.
	*/
	private String id;
	/**
	* name - имя.
	*/
	private String name;
	/**
	* desc - описание.
	*/
	private String desc;
	/**
	* create - дата создания.
	*/
	private long create;
	/**
	* comments - комментарии.
	*/
	private String comments;
	/**
	* При создании заявки вводим имя, описание, комментарии. Добавляется дата создания.
	* @param name имя.
	* @param desc описание.
	* @param create дата создания.
	* @param comments комментарии.
	*/
	public Item(String name, String desc, long create, String comments) {
		this.name = name;
		this.desc = desc;
		this.create = create;
		this.comments = comments;
	}
	/**
	* Имя.
	* @return имя.
	*/
	public String getName() {
		return this.name;
	}
	/**
	* Описание.
	* @return описание.
	*/
	public String getDesc() {
		return this.desc;
	}
	/**
	* Дата создания.
	* @return дата создания.
	*/
	public long getCreate() {
		return this.create;
	}
	/**
	* Комментарии.
	* @return комментарии.
	*/
	public String getComments() {
		return this.comments;
	}
	/**
	* Получаем id.
	* @return id.
	*/
	public String getId() {
		return this.id;
	}
	/**
	* Задается id.
	* @param id уникальный.
	*/
	public void setId(String id) {
		this.id = id;
	}
}