package ru.job4j.tracker;
/**
 * Тест класса Tracker.
 */
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Class Tracker работа с заявками.
*/
public class TrackerTest {
	/**
	* @Test для проверки 1.
	*/
	@Test
	/**
	* @Test для проверки добавление заявки.
	*/
	public void whenAddNewItemThenTrackerHasSameItem() {
		Tracker tracker = new Tracker();
		Item item = new Item("test1", "testDescription", 123, "testComments1");
		tracker.add(item);
		assertThat(tracker.findAll(item), is(item));
	}
	/**
	* @Test для проверки 2.
	*/
	@Test
	/**
	* @Test для проверки изменения заявки.
	*/
	public void whenUpdateDescReturnNewDesc() {
		Tracker tracker = new Tracker();
		Item previous = new Item("test1", "testDesc1", 123, "testComments1");
		tracker.add(previous);
		Item next = new Item("test2", "testDesc2", 1234, "testComments2");
		next.setId(previous.getId());
		tracker.update(next);
		assertThat(tracker.findById(previous.getId()).getName(), is("testDesc2"));
	}
	/**
	* @Test для проверки 3.
	*/
	@Test
	/**
	* @Test для проверки удаления заявки.
	*/
	public void whenDeleteItemReturnNull() {
		Tracker tracker = new Tracker();
		Item item = new Item("test1", "testDesc1", 123, "testComments1");
		tracker.add(item);
		tracker.delete(item);
		int[] expected = null;
		assertThat(tracker.findById(item.getId()), is(expected));
	}
	/**
	* @Test для проверки 4.
	*/
	@Test
	/**
	* @Test для проверки поиска всех заполненых заявок.
	*/
	public void whenSearchAllItem() {
		Tracker tracker = new Tracker();
		Item item1 = new Item("test1", "testDesc1", 123, "testComments1");
		tracker.add(item1);
		Item item2 = new Item("test2", "testDesc2", 1234, "testComments2");
		tracker.add(item2);
		Item item3 = new Item("test3", "testDesc3", 12345, "testComments3");
		tracker.add(item3);
		int expected = 3;
		Item[] findItem = tracker.findAll();
		assertThat(findItem.length, is(expected));
	}
	/**
	* @Test для проверки 5.
	*/
	@Test
	/**
	* @Test для проверки поиска заявки по имени.
	*/
	public void whenSearchItemByName() {
		Tracker tracker = new Tracker();
		Item item1 = new Item("test1", "testDesc1", 123, "testComments1");
		tracker.add(item1);
		Item item2 = new Item("test2", "testDesc2", 1234, "testComments2");
		tracker.add(item2);
		Item item3 = new Item("test3", "testDesc3", 12345, "testComments3");
		tracker.add(item3);
		Item item4 = new Item("test1", "testDesc4", 123456, "testComments4");
		tracker.add(item4);
		int expected = 2;
		Item[] findName = tracker.findByName("test1");
		assertThat(findName.length, is(expected));
	}
	/**
	* @Test для проверки 6.
	*/
	@Test
	/**
	* @Test для проверки поиска заявкипо ID.
	*/
	public void whenSearchItemById() {
		Tracker tracker = new Tracker();
		Item previous = new Item("test1", "testDesc1", 123, "testComments1");
		tracker.add(previous);
		Item next = new Item("test2", "testDesc2", 1234, "testComments2");
		next.setId(previous.getId());
		assertThat(tracker.findById(next.getId()), is(next));
	}
}