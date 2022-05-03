package week_5_2;

/*
 * b) Loop Detection: Given a circular linked list, implement an algorithm
 * that returns the node at the beginning of the loop.
 * DEFINITION:
 * Circular linked list: A (corrupt) linked list in which a node's
 * next pointer points to an earlier node, so as to make a loop
 * in the linked list.
 * EXAMPLE
 * Input: A -> B -> C -> D -> E -> C [the same C as earlier]
 * Output: C
 */
public class LinkedListLoopTest {

    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        Node<Integer> node4 = new Node<>(4);
        Node<Integer> node5 = new Node<>(5);
        Node<Integer> node6 = new Node<>(6);
        
        SinglyLinkedList<Integer> linearList = new SinglyLinkedList<>(node4);
        linearList.addNode(node5);
        linearList.addNode(node6);
        System.out.print("linearList -> ");
        linearList.printList();
        
        SinglyLinkedList<Integer> circularList = new SinglyLinkedList<>(node1);
        circularList.addNode(node2);
        circularList.addNode(node3);
        circularList.addNode(node1);
    }
    
}
