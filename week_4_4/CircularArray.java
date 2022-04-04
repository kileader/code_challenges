package week_4_4;

public class CircularArray {
    
    private Object[] arr;
    
    public CircularArray(Object[] arr) {
        this.arr = arr;
    }
    
    public Object get(int index) {
        return arr[index];
    }
    
    public Object[] get() {
        return arr;
    }
    
    public void cycleForward() {
        Object temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }
    
    public void cycleBackward() {
        Object temp = arr[0];
        for (int i = 0; i < arr.length - 2; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
    }
}
