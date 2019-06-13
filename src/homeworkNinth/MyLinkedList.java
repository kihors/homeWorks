package homeworkNinth;

public class MyLinkedList<T> implements List<T> {

    private Node<T> first;
    private Node<T> last;
    private static int size = 0;

    @Override
    public void add(T value) {
        Node<T> newNode = new Node<>(null, value, null);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            newNode.prev = last;
            newNode.next = newNode;
            last = newNode;
        }
        size++;
    }

    @Override
    public void add(T value, int index) {
        if (checkIndex(index)) {
            Node<T> tNode = new Node<>(null, value, null);
            if (isEmpty() || index == size()) {
                add(value);
            } else {
                Node<T> indexNode = nodeIterator(index);
                tNode.prev = indexNode.prev;
                tNode.next = indexNode;
                indexNode.prev.next = tNode;
                indexNode.prev = tNode;
                size++;
            }
        }
    }

    @Override
    public void addAll(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i));
        }
    }

    @Override
    public T get(int index) {
        T value = null;
        if (checkIndex(index)) {
            value = nodeIterator(index).item;
        }
        return value;
    }

    @Override
    public void set(T value, int index) {
        if (checkIndex(index)) {
            nodeIterator(index).item = value;
        }
    }

    @Override
    public T remove(int index) {
        T result = null;
        if (checkIndex(index) && !isEmpty()) {
            Node<T> tNode = nodeIterator(index);
            result = tNode.item;
            tNode.prev.next = tNode.next;
            tNode.next.prev = tNode.prev;
            tNode = null;
            size--;
        }
        return result;
    }

    @Override
    public T remove(T t) {
        if (t != null) {
            for (int i = 0; i < size; i++) {
                if (t.equals(get(i))) {
                    remove(i);
                    return t;
                }
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private boolean checkIndex(int index) {
        if (index < 0 && index > size) {
            throw new IndexOutOfBoundsException();
        }
        return true;
    }

    private Node<T> nodeIterator(int index) {
        Node<T> result = first;
        if (checkIndex(index)) {
            for (int i = 0; i < index; i++) {
                result = result.next;
            }
        }
        return result;
    }

    private static class Node<T> {
        T item;
        Node<T> next;
        Node<T> prev;

        Node(Node<T> prev, T element, Node<T> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
