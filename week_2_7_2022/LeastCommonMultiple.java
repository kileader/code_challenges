package week_2_7_2022;

import java.util.*;

/*
 * Create a function that takes an array of more than three numbers and returns the Least Common Multiple (LCM).
 */
public class LeastCommonMultiple {

    public static void main(String[] args) {
        int[] arr1 = {5, 4, 6, 46, 54, 12, 13, 17};
        int[] arr2 = {46, 54, 466, 544};
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr4 = {13, 6, 17, 18, 19, 20, 37};
        System.out.println("lcmOfArray([5, 4, 6, 46, 54, 12, 13, 17]) -> " + lcmOfArray(arr1));
        System.out.println("lcmOfArray([46, 54, 466, 544]) -> " + lcmOfArray(arr2));
        System.out.println("lcmOfArray([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) -> " + lcmOfArray(arr3));
        System.out.println("lcmOfArray([13, 6, 17, 18, 19, 20, 37]) -> " + lcmOfArray(arr4));
    }

    private static int lcmOfArray(int[] nums) {
        Map<Integer, Integer> primes = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = 2; j <= num; j++) {
                int occurrences = 0;
                if (primes.containsKey(j)) {
                    occurrences = primes.get(j);
                }
                while (num % j == 0) {
                    num /= j;
                    if (occurrences > 0) {
                        occurrences--;
                    } else if (primes.containsKey(j)){
                        primes.replace(j, primes.get(j) + 1);
                    } else {
                        primes.put(j, 1);
                    }
                }
            }
        }
        int ans = 1;
        for (Map.Entry<Integer, Integer> entry : primes.entrySet()) {
            ans *= Math.pow(entry.getKey(), entry.getValue());
        }
        return ans;
    }
}
