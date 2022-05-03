package week_5_2;

public class Node<T> {
    
    T data;
    Node<T> next;
    boolean checked;
    
    public Node(T data) {
        this.data = data;
        this.next = null;
        checked = false;
    }
    
}
