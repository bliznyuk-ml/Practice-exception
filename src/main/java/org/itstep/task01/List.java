package org.itstep.task01;

public class List<S> {
    private Object[] obj;
    private int size = -1;
    private int cur = -1;

    public List(int size) {
        cur = 0;
        this.size = size;
        obj = new Object[size];
    }

    public Object get(int idx) {
        return obj[idx];
    }

    public void add(Object item) throws FullListException {
        if (cur >= size) throw new FullListException("Array is full");
        obj[cur++] = item;
    }

    public void removeLast() throws EmptyListException {
        if (cur <= 0) throw new EmptyListException("Array is empty");
        obj[--cur] = null;
    }
}
