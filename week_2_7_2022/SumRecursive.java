package week_2_7_2022;

/*
 * Write a function that finds the sum of an array. Make your function recursive.
 */
/*
// First Solution
public class SumRecursive {
    
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4};
        Integer[] arr2 = {1,2};
        Integer[] arr3 = {1};
        Integer[] arr4 = {};
        System.out.println("sum([1, 2, 3, 4]) -> " + sum(arr1));
        System.out.println("sum([1, 2]) -> " + sum(arr2));
        System.out.println("sum([1] -> " + sum(arr3));
        System.out.println("sum([]) -> " + sum(arr4));
    }
    
    private static int sum(Integer[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Integer[] summedUp = recurse(nums);
        return summedUp[0];
    }
    
    private static Integer[] recurse(Integer[] nums) {
        if (nums.length == 1) {
            return nums;
        }
        List<Integer> numsList = new ArrayList<>();
        numsList.add(nums[0] + nums[1]);
        for (int i = 2; i < nums.length; i++) {
            numsList.add(nums[i]);
        }
        Integer[] ans = new Integer[numsList.size()];
        ans = numsList.toArray(ans);
        return recurse(ans);
    }
    
}
*/
// Better Solution
import java.util.Arrays;

public class SumRecursive {
    
    public static void main(String[] args) {
        System.out.println("sum([1, 2, 3, 4]) -> " + sum(new int[] {1, 2, 3, 4}));
        System.out.println("sum([1, 2]) -> " + sum(new int[] {1, 2}));
        System.out.println("sum([1] -> " + sum(new int[] {1}));
        System.out.println("sum([]) -> " + sum(new int[] {}));
    }
    
    private static int sum(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        return nums[nums.length-1] + sum(Arrays.copyOf(nums, nums.length-1));
    }
    
}
