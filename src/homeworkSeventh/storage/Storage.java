package homeworkSeventh.storage;

public class Storage<T, V> {
    private T key;
    private V value;

    public Storage() {
    }

    public Storage(T key, V value) {
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
