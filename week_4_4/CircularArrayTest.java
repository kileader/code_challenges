package week_4_4;

import java.util.Iterator;

public class CircularArrayTest {
    public static void main(String[] args) {
        
        CircularArray<Integer> intArr = new CircularArray<Integer>(new Integer[] {1,2,3,4,5});
        for(int i = 0; i < intArr.get().length; i++) {
            System.out.print(intArr.get(i) + " ");
        }
        intArr.cycleForward();
        System.out.println();
        for(int i = 0; i < intArr.get().length; i++) {
            System.out.print(intArr.get(i) + " ");
        }
        intArr.cycleBackward();
        System.out.println();
        for(int i = 0; i < intArr.get().length; i++) {
            System.out.print(intArr.get(i) + " ");
        }
        
        System.out.println();
        System.out.println();
        
        CircularArray<String> strArr = new CircularArray<String>(new String[] {"Hi", "There", "My", "Name", "Is", "Kevin"});
        for(int i = 0; i < strArr.get().length; i++) {
            System.out.print(strArr.get(i) + " ");
        }
        strArr.cycleForward();
        System.out.println();
        for(int i = 0; i < strArr.get().length; i++) {
            System.out.print(strArr.get(i) + " ");
        }
        strArr.cycleBackward();
        System.out.println();
        for(int i = 0; i < strArr.get().length; i++) {
            System.out.print(strArr.get(i) + " ");
        }
        
        System.out.println();
        Iterator<String> it = strArr.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
    }
}
