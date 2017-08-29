package ru.job4j.array;
/**
 * Тест класса ArrayDuplicate.
 */
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * ArrayDuplicateTest удаление дубликатов в массиве.
 */
public class ArrayDuplicateTest {
	/**
	* @Test для проверки 1.
	*/
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
		ArrayDuplicate dupl = new ArrayDuplicate();
		String[] array =  {"Привет", "Мир", "Привет", "Супер", "Мир"};
		String[] result = dupl.remove(array);
		String[] expected = {"Привет", "Мир", "Супер"};
		assertThat(result, is(expected));
    }
}