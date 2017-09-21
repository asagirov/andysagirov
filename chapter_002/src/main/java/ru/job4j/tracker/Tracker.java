package ru.job4j.tracker;
import java.util.Arrays;
import java.util.*;
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
		item.setId(String.valueOf(System.currentTimeMillis() + RN.nextInt()));
		this.items[position++] = item;
		return item;
	}
	/**
	* Редактирование заявки.
	* @param item - заявка.
	*/
	public void update(Item item) {
		item.getId = item;
	}
	/**
	* Удаление заявки.
	* @param item - заявка.
	*/
	public void delete(Item item) {
		item.getId = null;
	}
	/**
	* Получение списка всех заполненных заявок.
	* @return список заявок.
	*/
	public Item[] findAll(Item item) {
		int n = item.length;
		for (Item item : items) {
			if (item == null) {
				item = item[n - 1];
				n--;
			}
		}
		return Arrays.copyOf(item, n);
	}
	/**
	* Поиск заявок по имени.
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
}