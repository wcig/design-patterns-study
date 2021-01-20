package org.example.wcig.interpreter.example;

public class ArrayList_<E> implements List_<E> {
    private E[] objs = (E[])new Object[10];
    private int index;

    @Override
    public void add(E e) {
        if (index == objs.length) {
            E[] newObjs = (E[]) new Object[objs.length * 2];
            System.arraycopy(objs, 0, newObjs, 0, objs.length);
            objs = newObjs;
        }

        objs[index] = e;
        index++;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public Iterator_ iterator() {
        return new Itr();
    }

    private class Itr implements Iterator_<E> {
        private int cursor;

        @Override
        public boolean hasNext() {
            return cursor != index;
        }

        @Override
        public E next() {
            int i = cursor;
            cursor++;
            return objs[i];
        }
    }
}
