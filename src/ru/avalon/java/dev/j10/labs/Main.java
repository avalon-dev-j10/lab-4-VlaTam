package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.generator.PersonCreator;
import ru.avalon.java.dev.j10.labs.generator.StringCreator;
import java.util.Comparator;


public class Main {

	// Компаратор для сортировки массива по возрастанию
	public static class AscendingSort <T extends Comparable<T>> implements Comparator<T> {

		@Override
		public int compare(T firstPerson, T secondPerson) {
			return firstPerson.compareTo(secondPerson);
		}
	}

	// Компаратор для сортировки массива по убыванию
	public static class DescendingSort <T extends Comparable<T>> implements Comparator<T> {

		@Override
		public int compare(T firstPerson, T secondPerson) {
			return -firstPerson.compareTo(secondPerson);
		}
	}

    public static void main(String[] args) {
        /*
         * TODO(Студент): Проинициализируйте массив strings
         *
         * Массив слелдует проинициализировать таким образом,
         * чтобы он содержал 20 строк, расположенных не
         * по порядку.
         */

	    String[] strings = new String[20];
	    for (int i = 0; i < strings.length; i++)
	    	strings[i] = new StringCreator().next();

		System.out.println("\t\t\tIt's random strings:");
	    for (String string: strings)
			System.out.println(string);

	    /*
	     * TODO(Студент): Проинициализируйте массив persons
	     *
	     * 1. Создайте класс, реализующий интерфейс Person.
	     *
	     * 2. Проинициализируйте массив persons 20
	     *    экземплярыми созданного класса.
	     */
	    Person[] persons = new RealPerson[20];
		for (int i = 0; i < persons.length; i++)
			persons[i] = new PersonCreator().next();

		System.out.println("\n\t\t\tIt's random persons:");
		for (RealPerson person: (RealPerson[]) persons)
			System.out.println(person);

        /*
         * TODO(Студент): Проинициализируйте переменную sort
         *
         * 1. Создайте класс, реализующий интерфейс Sort
         *
         * 2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */
        Sort sort = new InsertionSort();


        /*
         * TODO(Студент): Проинициализируйте переменную comparator
         *
         * 1. Создайте класс, реализующий интерфейс Comparator.
         *    Подумайте о контексте, в котором будет
         *    использоваться экземпляр.
         *
         * 2. Проинициализируйте переменную comparator
         *    экземпляром созданного класса.
         */
        Comparator comparator = new AscendingSort();

        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(persons);
		System.out.println("\n\t\t\tArray of persons is sorted in ascending order:");
		for (RealPerson person: (RealPerson[]) persons)
			System.out.println(person);

        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(strings);
		System.out.println("\n\t\t\tArray of strings is sorted in ascending order:");
		for (String string: strings)
			System.out.println(string);

        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
        sort.sort(strings, new DescendingSort());
		System.out.println("\n\t\t\tArray of strings is sorted in descending order:");
		for (String string: strings)
			System.out.println(string);
    }
}
