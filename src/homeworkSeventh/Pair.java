package homeworkSeventh;

import java.util.Objects;

class Pair<T, V> {
    private final T firstValue;
    private final V secondValue;

    private Pair(T firstValue, V secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public static <T, V> Pair<T, V> of(T firstValue, V secondValue) {
        return new Pair<>(firstValue, secondValue);
    }

    public T getFirst() {
        return firstValue;
    }

    public V getSecond() {
        return secondValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Pair<?, ?> pair = (Pair<?, ?>) obj;

        if (!Objects.equals(firstValue, pair.firstValue)) {
            return false;
        }
        return Objects.equals(secondValue, pair.secondValue);
    }

    @Override
    public int hashCode() {
        int result;
        if (firstValue != null) {
            result = firstValue.hashCode();
        } else {
            result = 0;
        }
        if (secondValue != null) {
            result = 31 * result + secondValue.hashCode();
        } else {
            result = 31 * result;
        }
        return result;
    }
}
