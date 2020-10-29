package tools;

public class Tools {
    public static <T extends Comparable<T>> T numberMax(T a, T b){
        return a.compareTo(b) >= 0 ? a : b;
    }

    public static <T> void exchange(T[] arr, int a, int b){
        T tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
