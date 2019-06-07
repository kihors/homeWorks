package homeworkSeventh.storage;

import java.util.ArrayList;

public class Storage<T, V> {
    private ArrayList<T> key = new ArrayList<>();
    private ArrayList<V> value = new ArrayList<>();

    public Storage() {
    }

    public V get(T key) {
        for (int i = 0; i < this.key.size(); i++) {
            if (this.key.get(i) == key) {
                return this.value.get(i);
            }
        }
        return null;
    }

    public void put(T key, V value) {
        this.key.add(key);
        this.value.add(value);
    }
}
