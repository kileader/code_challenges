package week_3_14;

public class SinglyLinkedList<T> {
    
    static class Node<T> {
        Node<T> next;
        T data;
        Node(T data) {
            this.data = data;
            this.next = null;
        }   
    }
    
    public Node<T> head = null;
    public Node<T> tail = null;
    
    public void addNode(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    
    public void addNode(Node<T> node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }
    
}
