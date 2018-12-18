package primitives;

public interface IntList {
    //возвращает кол-во элементов
    int size();

    //возвращает true, если такой элемент есть в списке
    boolean contains(int x );

    //добавляет новый элемеент в конец списка
    void add(int e);

    //возвращает элемент по индексу
    int get(int index) throws IllegalAccessException;

    //удаляет элемент по индексу
    void remove(int index);

    //сортирует по возрастанию
    void sort();

    //добавляет в конец все элементы
    void addAll(IntList intList) throws IllegalAccessException;

    //добавляет в данный список все элементы из данного списка
    //начиная со startPosition
    void addAll(IntList intList, int startPosition) throws IllegalAccessException;

    //возвращает содержимое списка в виде массива
    int [] toArray();

    //возвращает индекс первого вхождения
    int indexOf(int value);

    Iterator iterator();
}
