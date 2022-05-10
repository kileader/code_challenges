package week_5_9;

/*
 * 2) Power Set: Write a method to return all subsets of a set.
 */
public class PowerSet {
    
    public static void main(String[] args) {
        char[] set = {'x', 'y', 'z', 'a'};
        findSubsets(set);
    }
    
    static void findSubsets(char[] set) {
        
        // 2^set.length is the number of subsets, which is equal to the bitwise operation (1 << set.length)
        for (int i = 0; i < (1 << set.length); i++) {
            
            System.out.print("{ ");
            
            // (i << j) is a number with jth bit 1, so using "&" gets which numbers are present in the subset and which are not
            for (int j = 0; j < set.length; j++) {
                if ((i & (1 << j)) > 0) System.out.print(set[j] + " ");
            }
            
            System.out.println("}");
            
        }
    
    }
}
