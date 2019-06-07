package homeworkSeventh.storage;

public class Container <T, V> {
    private T key;
    private V value;

    public Container() {
    }

    public Container(T key, V value) {
        this.key = key;
        this.value = value;
    }

    public V get(T key) {
        return value;
    }

    public void put(T key, V value) {
        this.key = key;
        this.value = value;
    }
}
