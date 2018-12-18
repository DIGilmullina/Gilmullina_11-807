package generics;

import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T> {
    private T[] elements;
    private int count = 0;
    private int capasity;
    private static final double EXTENSION_COEF = 1.5;

    public MyArrayList() {
        this.elements = (T[]) new Object[10];
    }

    public void add(T e) {
        if (capasity == count) {
            grow();
        }
        elements[count++] = e;
    }

    private void grow() {
        int newCapasity = (int) (capasity * EXTENSION_COEF);
        T[] newElements = (T[]) new Object[newCapasity];
        for (int i = 0; i < capasity; i++) {
            newElements[i] = elements[i];
        }
        capasity = newCapasity;
        elements = newElements;
    }

    public T get(int index) {
        return elements[index];
    }

    //число элементов в списке
    int size() {
        return count;
    }

    //есть ли в списке такой элемент
    boolean contains(T value) {
        for (int i = 0; i < count; i++) {
            if (elements[i] == value){
                return true;
            }
        }
        return false;
    }

    //удаление элемента по индекс (со смещением элементов влево)
    void remove(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("нет элемнта с таким индексом");
        }
        for (int i = 0; i < elements.length; i++) {
            if (i == index) {
                T[] OldArray = (T[]) new Object[elements.length - 1];
                System.arraycopy(elements, 0, OldArray, 0, i);
                System.arraycopy(elements, i + 1, OldArray, i, elements.length - 1 - index);
            }
        }
    }

    //возвращает все элементы из списка в виде массива
    T[] toArray() {
        T[] arr = (T[]) new Object[count];
        for (int i = 0; i < count; i++) {
            arr[i] = elements[i];
        }
        return arr;
    }

    //добавление всех элементов из списка list в данный список(в конец)
    void addAll(MyArrayList<T> list) {
        T[] newList = list.toArray();
        for (int i = 0; i < newList.length; i++) {
            if (capasity==count) {
                grow();
            }
            elements[count+i]=newList[i];
        }
    }

    //добавление всех элементов из списка list в данный список
    //начиная с позиции index
    void addAll(MyArrayList<T> list, int index) {
    }

    public Iterator<T> iterator() {
        return new MyIter();
    }

    public class MyIter implements Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public T next() {
            return elements[currentIndex++];
        }
    }
}
