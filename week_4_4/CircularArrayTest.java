package week_4_4;

public class CircularArrayTest {
    public static void main(String[] args) {
        
        CircularArray intArr = new CircularArray(new Integer[] {1,2,3,4,5});
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
        
        CircularArray strArr = new CircularArray(new String[] {"Hi", "There", "My", "Name", "Is", "Kevin"});
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
    }
}
