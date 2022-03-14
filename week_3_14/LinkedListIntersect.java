package week_3_14;

import week_3_14.SinglyLinkedList.Node;

/*
 * 1) Given two singly linked lists that intersect at some point, find the intersecting node. Assume the lists are non-cyclical.
 * For example, given A = 3, 7, 8, 10 and B = 99, 1, 8, 10, return the node with value 8.
 * In this example, assume nodes with the same value are the exact same node objects.
 * Do this in 0( m + n) time (where m and n are the lengths of the lists) and constant space.
 */
public class LinkedListIntersect {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> listA = new SinglyLinkedList<>();
        listA.addNode(3);
        listA.addNode(7);
        
        SinglyLinkedList<Integer> listB = new SinglyLinkedList<>();
        listB.addNode(99);
        listB.addNode(1);
        listB.addNode(20);
        
        Node<Integer> sharedNode = new Node<>(8);
        listA.addNode(sharedNode);
        listB.addNode(sharedNode);
        
        listA.addNode(10);
        listB.addNode(10);
        System.out.println("findIntersect(listA, listB).data -> " + findIntersect(listA, listB).data);
    }
    
    public static Node<?> findIntersect(SinglyLinkedList<?> listA, SinglyLinkedList<?> listB) {
        Node<?> currentA = listA.head;
        Node<?> currentB = listB.head;
        do {
            currentA.setChecked();
            currentA = currentA.next;
        } while (currentA != null);
        do {
            if (currentB.getChecked() == true) {
                return currentB;
            }
            currentB = currentB.next;
        } while (currentB != null);
        throw new IllegalArgumentException("No intercept");
    }
}
