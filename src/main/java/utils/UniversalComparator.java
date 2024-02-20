package utils;

import java.util.Comparator;

public interface UniversalComparator<T> extends Comparator<T> {
    @Override
    int compare(T o1, T o2);
}

