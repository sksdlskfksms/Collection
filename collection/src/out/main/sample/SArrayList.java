package out.main.sample;

import java.util.*;

/**
 * <pre>
 *  1. 다음을 구현하라.
 *  2. [throw new UnsupportedOperationException()] 의 메소드는 구현할 필요가 없다.
 *  3. public Iterator<Object> iterator() 는 구현할수있으면 구현한다.
 *
 * </pre>
 * @param <E>
 */
public class SArrayList<E> implements List<E> {
    private E[] array;
    private int sizeLimit;   // 초기 크기 설정값
    private int lastIndex;   // 마지막 데이터가 들어있는 index 번호

    public SArrayList(){
        sizeLimit = 3;
        lastIndex = -1;
        array = newObject(sizeLimit);
    }

    public E[] newObject(int size){
        return (E[]) new Object[size];
    }

    public String toString(){
        StringBuilder tostring = new StringBuilder();

        if(array != null && lastIndex > -1){
            for(int i = 0; i <= lastIndex; i++){
                tostring.append(array[i]).append(", ");
            }
            tostring.setLength(tostring.length() - 2);
        }

        return "[" + tostring + "]";
    }

    public void reSizing(int size){
        // ReSizing 하기 전에 tmp에 기존 데이터 백업
        E[] tmpArray = newObject(size);
        System.arraycopy(array, 0, tmpArray, 0, array.length);

        // ReSizing
        array = newObject(size);

        // 백업했던 데이터 가져오기
        System.arraycopy(tmpArray, 0, array, 0, tmpArray.length );
    }

    @Override
    public int size() {
        // TODO - OK
        return lastIndex + 1;
    }

    @Override
    public boolean isEmpty() {
        // TODO - OK
        return lastIndex == -1;
    }

    @Override
    public boolean add(E element) {
        // TODO - OK
        // 배열크기가 초기설정값을 초과하면, +sizeLimit 리사이징 후 Data set
        if(lastIndex + 1 >= array.length){
            reSizing(array.length + sizeLimit);
        }

        // Data set
        array[++lastIndex] = element;
        return true;
    }

    @Override
    public void add(int index, E element) {
        // TODO - OK
        // 배열크기가 초기설정값을 초과하면, +sizeLimit 리사이징 후 Data set
        if(lastIndex + 1 >= array.length){
            reSizing(array.length + sizeLimit);
        }

        // add할 index 이상 데이터 Right Shift
        for(int i = lastIndex; i >= index; i--){
            array[i+1] = array[i];
        }

        // Data set
        array[index] = element;
        lastIndex += 1;
    }

    @Override
    public E get(int index) {
        // TODO - OK
        return array[index];
    }

    @Override
    public E set(int index, E element) {
        // TODO - OK
        E oldValue = array[index];
        array[index] = element;
        return oldValue;
    }

    @Override
    public boolean contains(Object o) {
        // TODO - OK
        for(int i = 0; i <= lastIndex; i++){
            if(array[i].toString().contains((CharSequence) o))
                return true;
        }
        return false;
    }

    @Override
    public E remove(int index) {
        // TODO - OK
        E oldValue = array[index];

        // 삭제할 index 보다 큰 값들만 Left Shift
        for (int i = 0; i < lastIndex+1; i++){
            if(i > index && i <= lastIndex){
                array[i-1] = array[i];
            }
        }

        lastIndex--;

        return oldValue;
    }

    @Override
    public boolean remove(Object o) {
        // TODO - OK
        // 일치하는 값 있는지 확인해서 있으면 -> remove(int index)
        for(int index = 0; index < array.length; index++){
            if ( array[index] == o ) {
                remove(index);
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        // TODO - OK
        lastIndex = -1;
        array = newObject(sizeLimit);
    }

    @Override
    public int indexOf(Object o) {
        // TODO - OK
        for(int i = 0; i <= lastIndex; i++){
            if ( array[i] == o ) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO - OK
        for(int i = lastIndex; i > -1; i--){
            if ( array[i] == o ) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        // TODO - OK
        List<E> list = Arrays.asList(newObject(toIndex - fromIndex));

        for(int i=0; fromIndex < toIndex; fromIndex++, i++){
            list.set(i, array[fromIndex]);
        }

        return list;
    }

    @Override
    public Object[] toArray() {
        // TODO - OK
        Object[] ob = new Object[array.length];
        System.arraycopy(array, 0, ob, 0, array.length);
        return ob;
    }

    @Override
    public Iterator<E> iterator() {
        // TODO - OK
        return new MyIterator();
    }

    class MyIterator implements Iterator<E> {
        int nextCount;
        int hasNextCount;

        private MyIterator(){
            this.nextCount = 0;
        }

        @Override
        public boolean hasNext() {
            return nextCount <= lastIndex;
        }

        @Override
        public E next() {
            E e = array[nextCount];
            nextCount++;
            return e;
        }

        @Override
        public void remove() {
            SArrayList.this.remove(nextCount-1);
        }
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException();
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
    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException();
    }

}
