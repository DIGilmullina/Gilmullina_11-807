import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {
    private MyNode<T> head;
    private int count = 0;

    public int size() {
        return count;
    }

    //добавление в конец
    public void add(T e) {
        MyNode<T> newNode = new MyNode<>();
        newNode.setValue(e);
        newNode.setNext(null);
        if (head != null) {
            MyNode<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        } else {
            head = newNode;
        }
        count++;
    }

    public boolean contains(T value) {
        if (head == null){
            return false;
        }
        MyNode<T> current = head;
        for (int i = 0; i < count; i++) {
            if (current.getValue() == value) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public T[] toArray() {
        T[] array = (T[]) new Object[count];
        MyNode<T> current = head;
        for (int i = 0; i < count; i++) {
            array[i] = current.getValue();
            current = current.getNext();
        }
        return array;
    }

    public T get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index: " + index + " вне границ");
        }
        MyNode<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return  current.getValue();
    }

    public void addAll (MyLinkedList<T> myNewLinkedList) {
        MyNode<T> toadd = myNewLinkedList.head;
        for (int i = 0; i < myNewLinkedList.size(); i++) {
            add(toadd.getValue());
            toadd = toadd.getNext();
        }
    }

    public void addFromIndex (MyLinkedList<T> myNewLinkedList, int index) {

    }

    public void remove(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index: " + index + " вне границ");
        }
        if (index == 0) {
            head = head.getNext();
        } else {
            MyNode<T> beforeRemovable = head;
            for (int i = 0; i < index - 1; i++) {
                beforeRemovable = beforeRemovable.getNext();
            }
            MyNode<T> nodeToRemove = beforeRemovable.getNext();
            beforeRemovable.setNext(nodeToRemove.getNext());
        }
        count--;
    }


    public Iterator<T> iterator() {
        return new MyIter();
    }

    public class MyIter implements Iterator<T> {
        private MyNode<T> currentNode = head;

        @Override
        public boolean hasNext() {
            return currentNode.getNext() != null;
        }

        @Override
        public T next() {
            T next = currentNode.getNext().getValue();
            currentNode = currentNode.getNext();
            return next;
        }
    }
}
