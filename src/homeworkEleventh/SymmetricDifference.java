package homeworkEleventh;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> difference = new HashSet<>(set1);
        difference.addAll(set2);
        Set<T> similarity = new HashSet<>(set1);
        similarity.retainAll(set2);
        difference.removeAll(similarity);
        return difference;
    }
}
