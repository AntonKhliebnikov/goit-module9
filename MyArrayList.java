package module9;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public MyArrayList(int initCapacity) {
        if (initCapacity <= 0) {
            throw new IllegalArgumentException();
        }
        elements = new Object[initCapacity];
    }

    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }


    public int size() {
        return size;
    }

    public void add(T element) {
        resizeIfNeeded();
        elements[size] = element;
        size++;
    }

    public void clear() {
        size = 0;
        elements = new Object[DEFAULT_CAPACITY];

    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        Objects.checkIndex(index, size);
        return (T) elements[index];
    }

    @SuppressWarnings("unchecked")
    public T remove(int index) {
        Objects.checkIndex(index, size);
        T removedElement = (T) elements[index];
        resizeIfNeeded();
        System.arraycopy(elements, index + 1, elements, index, size - 1);
        size--;
        return removedElement;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }

    private void resizeIfNeeded() {
        if (elements.length == size) {
            Object[] newArray = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newArray, 0, size);
            elements = newArray;
        }
    }
}
