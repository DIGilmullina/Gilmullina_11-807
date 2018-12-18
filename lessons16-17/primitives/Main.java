package primitives;

import primitives.IntArrayList;
import primitives.IntList;
import primitives.Iterator;

public class Main {
    public static void main(String[] args) {
        IntList list = new IntArrayList();
        list.add(41);
        list.add(74);
        list.add(6743);
        list.add(37);
        System.out.println(list.size());
        Iterator iter1 = list.iterator();

        while (iter1.hasNext()) {
            System.out.println(iter1.next());
        }

        Iterator iter2 = list.iterator();
        int sum = 0;
        while (iter2.hasNext()) {
            int e = iter2.next();
            sum += e;
        }
    }
}