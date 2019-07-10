import java.util.Collection;

public class MyGeneric {

    static <T> void arrayToCollection(T[] arr, Collection<T> collection) {
        for (T obj : arr) {
            collection.add(obj);
        }
    }

}
