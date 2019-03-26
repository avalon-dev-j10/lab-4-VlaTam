package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

public class InsertionSort implements Sort {

    @Override
    public void sort(Object[] array) {
        if (array instanceof Comparable[])
            sort((Comparable[])array);
    }

    @Override
    public void sort(Comparable[] array) {
        for (int i = 1; i < array.length; i++)
            for (int j = i; j > 0; j--)
                if (array[j].compareTo(array[j-1]) < 0){
                    Comparable buffer = array[j];
                    array[j] = array[j-1];
                    array[j-1] = buffer;
                }
    }

    @Override
    public void sort(Object[] array, Comparator comparator) {
        for (int i = 1; i < array.length; i++)
            for (int j = i; j > 0; j--)
                if (comparator.compare(array[j], array[j - 1]) < 0){
                    Object buffer = array[j];
                    array[j] = array[j - 1];
                    array[j-1] = buffer;
                }
    }
}
