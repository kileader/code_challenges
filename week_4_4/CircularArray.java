package week_4_4;

import java.util.Arrays;
import java.util.Iterator;

public class CircularArray<T> implements Iterable<T> {
    
    private T[] arr;
    
    public CircularArray(T[] arr) {
        this.arr = arr;
    }
    
    public T get(int index) {
        return arr[index];
    }
    
    public T[] get() {
        return arr;
    }
    
    public void cycleForward() {
        T temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }
    
    public void cycleBackward() {
        T temp = arr[0];
        for (int i = 0; i < arr.length - 2; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
    }

    @Override
    public Iterator<T> iterator() {
        return Arrays.stream(arr).iterator();
    }
    
}
