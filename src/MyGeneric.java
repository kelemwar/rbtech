import java.util.Collection;
/*
Write a generic method that takes an array of objects and a collection, and puts all
objects in the array into the collection.
*/
public class MyGeneric {

    static <T> void arrayToCollection(T[] arr, Collection<T> collection) {
        for (T obj : arr) {
            collection.add(obj);
        }
    }

}
