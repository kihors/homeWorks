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
            Node<T> newNode = new Node<>(null, value, null);
            if (isEmpty() || index == size()) {
                add(value);
            } else {
                Node<T> indexNode = nodeIterator(index);
                newNode.prev = indexNode.prev;
                newNode.next = indexNode;
                indexNode.prev.next = newNode;
                indexNode.prev = newNode;
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

//    @Override
//    public void set(T value, int index) {
//
//    }
//
//    @Override
//    public T remove(int index) {
//        return null;
//    }
//
//    @Override
//    public T remove(T t) {
//        return null;
//    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean checkIndex(int index) {
        if (index > 0 && index <= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return true;
    }

    public Node<T> nodeIterator(int index) {
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
