package by.it.karpovich.jd01_11;

import java.util.*;

public class ListB<T> implements List<T> {
    private T[] elements = (T[]) new Object[1];
    private int size = 0;

    @Override
    public boolean add(T t) {
        if (elements.length == size){
            elements = Arrays.copyOf(elements, elements.length * 3 / 2 + 1);
        }
        elements[size++] = t;
        return true;
    }

    @Override
    public T remove(int index) {
        T pre = elements[index];
        System.arraycopy(elements, index+1, elements, index, -- size - index);
        return pre;
    }

    @Override
    public T get(int index) {
        return elements[index];
    }

    @Override
    public T set(int index, T element) {
        T oldVal = elements[index];
        elements[index] = element;
        return oldVal;
    }

    @Override
    public void add(int index, T element) {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, size * 3 / 2 + 1);
        System.arraycopy(elements, index, elements, index+1, size-index);
        elements[index] = element;
        size++;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        T[] a = (T[]) c.toArray();
        int addLength = a.length;
        int minCapacity = size + addLength;
        if (minCapacity > elements.length)
            elements = Arrays.copyOf(elements, elements.length * 3 / 2 + 1);
        System.arraycopy(a,0, elements,size, addLength);
        size += addLength;
        return addLength != 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        String delimiter = "";
        for (int i = 0; i < size; i++) {
            sb.append(delimiter)
                    .append(elements[i]);
            delimiter = ", ";
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o)>=0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
