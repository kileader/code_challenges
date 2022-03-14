package week_3_14;

/*
 * 1) Given two singly linked lists that intersect at some point, find the intersecting node. Assume the lists are non-cyclical.
 * For example, given A = 3, 7, 8, 10 and B = 99, 1, 8, 10, return the node with value 8.
 * In this example, assume nodes with the same value are the exact same node objects.
 * Do this in 0( m + n) time (where m and n are the lengths of the lists) and constant space.
 */
public class SinglyLinkedList<T> {
    
    static class Node<T> {
        Node<T> next;
        T data;
        private boolean checked;
        Node(T data) {
            this.data = data;
            this.next = null;
            this.checked = false;
        }
        boolean getChecked() {
            return checked;
        }
        void setChecked() {
            this.checked = true;
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
