package week_5_2;

public class SinglyLinkedList<T> {
    
    Node<T> head;
    Node<T> curr;
    
    public SinglyLinkedList() {
        
    }
    
    public SinglyLinkedList(Node<T> head) {
        this.head = head;
        this.curr = head;
    }
    
    public void addData(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
        }
    }
    
    public void addNode(Node<T> node) {
        if (head == null) {
            head = node;
        }
        else {
            curr = head;
            while (curr.next != null) {
                curr.checked = true;
                curr = curr.next;
            }
            if (node.checked == true) {
                uncheckNodes();
                throw new IllegalArgumentException("Cannot add. Adding Node "
                        + node.data +  " would make the list loop.");
            }
            curr.next = node;
        }
        uncheckNodes();
    }
    
    public void uncheckNodes() {
        if (head == null) {
            return;
        } else {
            curr = head;
            while (curr.next != null) {
                curr.checked = false;
                curr = curr.next;
            }
        }
    }
    
    public void printList() {
        curr = head;
        if (curr.next != null) {
            while (curr.next != null) {
                System.out.print(curr.data + ", ");
                curr = curr.next;
            }
        }
        System.out.print(curr.data + "\n");
    }
    
}
