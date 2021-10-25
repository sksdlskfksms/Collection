package out.main.sample;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * <pre>
 *  1. 다음을 구현하라.
 *  2. [throw new UnsupportedOperationException()] 의 메소드는 구현할 필요가 없다.
 *
 * </pre>
 *
 * @param <E>
 */
public class SLinkedList<E> implements List<E> {

    private Node<E> head;

    private Node<E> tail;

    public static void main(String[] args) {
        SLinkedList<String> mll = new SLinkedList<>();
        mll.test();
    }

    @SuppressWarnings("unchecked")
    private void test() {
        Node<String> node = new Node<>("10");
        head = (Node<E>) node;
        tail = (Node<E>) node;

        print();

        node = new Node<String>("11");
        head.next = (Node<E>) node;
        tail = (Node<E>) node;

        print();

        node = new Node<String>("12");
        head.next.next = (Node<E>) node;
        tail = (Node<E>) node;

        print();

        head.next = head.next.next;
        print();
    }

    private void print() {
        Node<E> ptr = head;
        for ( ; ptr != null; ptr = ptr.next) {
            System.out.print(ptr.item + " -> ");
        }

        System.out.println();
    }

    static class Node<E> {
        E item;

        Node<E> next;

        Node(E element, Node<E> next) {
            this.item = element;
            this.next = next;
        }

        Node(E element) {
            this.item = element;
        }
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    class MyIterator implements Iterator<E> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public Object[] toArray() {
        return null;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new IllegalStateException();
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
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
    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
