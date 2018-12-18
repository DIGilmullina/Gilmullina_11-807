package primitives;

public class IntArrayList implements IntList {
    private int[] elements;
    private static final int DEFAULT_CAPASITY = 10;
    private int capasity;
    private int count = 0;
    private static final double EXTENSION_COEF = 1.5;

    public IntArrayList() {
        elements = new int[DEFAULT_CAPASITY];
        capasity = DEFAULT_CAPASITY;

    }

    @Override
    public int size() {
        int length = 0;
        for (int i = 0; i < count; i++) {
            length++;
        }
        return length;
    }

    @Override
    public boolean contains(int x) {
        for (int i = 0; i < count; i++) {
            if (elements[i] == x){
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(int e) {
        if (capasity == count) {
            grow();
        }
        elements[count++] = e;

    }

    private void grow() {
        int newCapasity = (int) (capasity * EXTENSION_COEF);
        int[] newElements = new int[newCapasity];
        for (int i = 0; i < capasity; i++) {
            newElements[i] = elements[i];
        }
        capasity = newCapasity;
        elements = newElements;
    }

    @Override
    public int get(int index) throws IllegalAccessException {
        if (index < 0 || index >= count) {
            throw new IllegalAccessException("нет такого элемента");
        }
        return elements[index];
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("нет элемнта с таким индексом");
        }
        for (int i = 0; i < elements.length; i++) {
            if (i == index) {
                int[] OldArray = new int[elements.length - 1];
                System.arraycopy(elements, 0, OldArray, 0, i);
                System.arraycopy(elements, i + 1, OldArray, i, elements.length - 1 - index);
                elements = OldArray;
            }
        }
    }

    @Override
    public void sort() {
        for (int i = 0; i < capasity; i++) {
            if (elements[i] > elements[i + 1]) {
                int buf = elements[i];
                elements[i] = elements[i + 1];
                elements[i + 1] = elements[i];
            }

        }

    }

    @Override
    public void addAll(IntList intList) throws IllegalAccessException {
        int[] newList = intList.toArray();
        for (int i = 0; i < newList.length; i++) {
            if (capasity==count) {
                grow();
            }
            elements[count+i]=newList[i];
        }

    }

    @Override
    public void addAll(IntList intList, int startPosition) throws IllegalAccessException {
        for (int i = 0; i < intList.size(); i++) {
            if (startPosition >= count ||capasity == count) {
                grow();
            }
            elements[startPosition] = intList.get(i);
            startPosition++;
        }

    }

    @Override
    public int[] toArray() {
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = elements[i];
        }
        return arr;

    }

    @Override
    public int indexOf(int value) {
        int elementsIndex = 0;
        for (int i = 0; i < count; i++) {
            if(elements[i] == value){
                elementsIndex = i;
                break;
            }
        }
        return elementsIndex;
    }

    @Override
    public Iterator iterator() {
        return new MyIter();
    }

    class MyIter implements Iterator {
        private int currentIndex;

        public MyIter() {
            currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public int next() {
//            int val = elements[currentIndex];
//            currentIndex++;
//            return val;
            return elements[currentIndex++];
        }
    }
}





