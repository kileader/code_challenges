package week_5_2;

public class LinkedListIntersectFinder {
    
    public static Node<?> findIntersect(SinglyLinkedList<?> listA, SinglyLinkedList<?> listB) {
        Node<?> currentA = listA.head;
        Node<?> currentB = listB.head;
        do {
            currentA.checked = true;
            currentA = currentA.next;
        } while (currentA != null);
        do {
            if (currentB.checked == true) {
                listA.uncheckNodes();
                listB.uncheckNodes();
                return currentB;
            }
            currentB = currentB.next;
        } while (currentB != null);
        listA.uncheckNodes();
        listB.uncheckNodes();
        throw new IllegalArgumentException("No intersection found between the lists.");
    }
    
}
