package patterns.Behavioral.Iterator;

import java.util.Iterator;

public class SimpleIterator<T> implements Iterator {

    private T[] objects;
    private int index = 0;

    public SimpleIterator(T[] objects) {
        this.objects = objects;
    }

    @Override

    public boolean hasNext() {
        return index < objects.length;
    }

    @Override
    public T next() {
        return objects[index++];
    }

    public static void main(String[] args) {
        Integer[] integers = new Integer[3];
        integers[0] = 1;
        integers[0] = 2;
        integers[0] = 3;

        SimpleIterator<Integer> iterator = new SimpleIterator<>(integers);
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            System.out.println(i);
        }
    }
}
