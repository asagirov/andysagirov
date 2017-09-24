package ru.job4j.tracker;
import java.util.Random;
/**
* Class Tracker работа с заявками.
* @author Andrey Sagirov (mailto:andrey.sagirov23@gmail.com)
* @version $Id$
* @since 21.09.2017
*/
public class Tracker {
	/**
	* items хранилище заявок.
	*/
	private Item[] items = new Item[100];
	/**
	* position следующая заявка.
	*/
	private int position = 0;
	/**
	* Генерация случайных чисел.
	*/
	private static final Random RN = new Random();
	/**
	* Создание новой заявки.
	* @param item - заявка.
	* @return созданная заявка.
	*/
	public Item add(Item item) {
		item.setId(this.generateId());
		this.items[position++] = item;
		return item;
	}
	/**
	* Редактирование заявки.
	* @param item - заявка.
	*/
	public void update(Item item) {
		for (Item i : this.items) {
			if (item.getId().equals(i.getId())) {
			i = item;
			break;
			}
		}
	}
	/**
	* Удаление заявки.
	* @param item - заявка.
	*/
	public void delete(Item item) {
		for (Item i : this.items) {
			if (item.getId().equals(i.getId())) {
			i = null;
			}
		}
	}
	/**
	* Получение списка всех заполненных заявок.
	* @param item список.
	* @return список заявок.
	*/
	public Item[] findAll(Item item) {
		int n = this.position;
		for (int index = 0; index != this.position; index++) {
			if (item == null) {
				n--;
			}
		}
		Item[] findAllItem = new Item[n];
		int i = 0;
		for (int index = 0; index != this.position; index++) {
			if (item != null) {
				findAllItem[i++] = this.items[index];
			}
		}
		return findAllItem;
	}
	/**
	* Поиск заявок по имени.
	* @param name имя.
	* @return список заявок.
	*/
	public Item[] findByName(String name) {
		int n = 0;
		for (Item item : items) {
			if (item.getName().equals(name)) {
				n++;
			}
		}
		Item[] searchName = new Item[n];
		int indexSearch = 0;
		for (Item item : items) {
			if (item.getName().equals(name)) {
				searchName[indexSearch++] = item;
			}
		}
		return searchName;
	}
	/**
	* Получение списка всех уникальному id.
	* @param id .
	* @return список заявок.
	*/
	public Item findById(String id) {
		Item result = null;
		for (Item item : items) {
			if (item != null && item.getId().equals(id)) {
				result = item;
				break;
				}
			}
		return result;
		}
		/**
	* Генерируем уникальный id.
	* @return id.
	*/
		String generateId() {
			return String.valueOf(System.currentTimeMillis() + RN.nextInt());
		}
}