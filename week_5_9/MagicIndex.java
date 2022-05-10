package week_5_9;

/*
 * 1) Magic Index: A magic index in an array A [ 0 ... n -1] is defined to be an index such that A[i] = i.
 * Given a sorted array of distinct integers, write a method to find a magic index, if one exists, in array A.
 * Follow up: What if the values are not distinct?
 */
public class MagicIndex {
    
    public static void main(String[] args) {
        System.out.print("printMagicIndex(new int[] {1,2,3,3}) -> ");
        printMagicIndex(new int[] {1,2,3,3});
        System.out.print("printMagicIndex(new int[] {9,9,9,9}) -> ");
        printMagicIndex(new int[] {9,9,9,9});
        System.out.print("printMagicIndex(new int[] {1,2,3,4}) -> ");
        printMagicIndex(new int[] {1,2,3,4});
        System.out.println("Non-distinct values don't matter with current algorithm.");
    }
    
    static void printMagicIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i) {
                System.out.println("Magic index is " + arr[i] + ".");
                return;
            }
        }
        System.out.println("No magic index exists.");
    }
    
}
