package week_5_2;

/*
 * Given two (singly) linked lists, determine if the two lists intersect.
 * Return the intersecting node. Note that the intersection is defined
 * based on reference, not value. That is, if the kth node of the first
 * linked list is the exact same node (by reference) as the jth node of
 * the second linked list, then they are intersecting.
 */
public class LinkedListIntersectTest {
    
    public static void main(String[] args) {
        Node<Character> nodeA = new Node<>('A');
        Node<Character> nodeB = new Node<>('B');
        Node<Character> nodeC = new Node<>('C');
        Node<Character> nodeD = new Node<>('D');
        Node<Character> nodeE = new Node<>('E');
        Node<Character> nodeF = new Node<>('F');
        Node<Character> nodeG = new Node<>('G');
        Node<Character> nodeH = new Node<>('H');
        
        SinglyLinkedList<Character> listOne = new SinglyLinkedList<>(nodeA);
        listOne.addNode(nodeB);
        listOne.addNode(nodeC);
        listOne.addNode(nodeD);
        
        SinglyLinkedList<Character> listTwo = new SinglyLinkedList<>(nodeE);
        listTwo.addNode(nodeF);
        listTwo.addNode(nodeC);
        
        SinglyLinkedList<Character> listThree = new SinglyLinkedList<>(nodeG);
        listThree.addNode(nodeH);
        listThree.addData('C');
        
        System.out.print("listOne -> ");
        listOne.printList();
        System.out.print("listTwo -> ");
        listTwo.printList();
        System.out.print("listThree -> ");
        listThree.printList();
        
        System.out.println("findIntersect(listOne, listTwo).data -> " 
                + LinkedListIntersectFinder.findIntersect(listOne, listTwo).data);
        
        System.out.println("findIntersect(listTwo, listOne).data -> " 
                + LinkedListIntersectFinder.findIntersect(listTwo, listOne).data);
        
        System.out.println("findIntersect(listTwo, listThree).data -> " 
                + LinkedListIntersectFinder.findIntersect(listTwo, listThree).data);
        
    }
    
}
