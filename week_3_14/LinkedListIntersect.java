package week_3_14;

import week_3_14.SinglyLinkedList.Node;

public class LinkedListIntersect {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> listA = new SinglyLinkedList<>();
        listA.addNode(3);
        listA.addNode(7);
        SinglyLinkedList<Integer> listB = new SinglyLinkedList<>();
        listB.addNode(99);
        listB.addNode(1);
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
            if (currentA.equals(currentB)) {
                return currentA;
            }
            currentA = currentA.next;
            currentB = currentB.next;
        } while (currentA != null || currentB != null);
        throw new IllegalArgumentException("No intercept");
    }
}
