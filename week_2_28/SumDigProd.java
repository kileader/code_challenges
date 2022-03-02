package week_2_28;

/*
 * Product of Digits of Sum
 * Create a function that takes one, two or more numbers 
 * as arguments and adds them together to get a new number. 
 * The function then repeatedly multiplies the digits of the 
 * new number by each other, yielding anew number, until the 
 * product is only 1 digit long. Return the final product.
 */
public class SumDigProd {
    
    public static void main(String[] args) {
        System.out.println("sumDigProd(16,28) -> " + sumDigProd(16,28));
        System.out.println("sumDigProd(0) -> " + sumDigProd(0));
        System.out.println("sumDigProd(1,2,3,4,5,6) -> " + sumDigProd(1,2,3,4,5,6));
    }
    
    public static int sumDigProd(int... nums) {
        Integer ans = 0;
        for (int num : nums) {
            ans += num;
        }
        char[] chars = ans.toString().toCharArray();
        while (chars.length != 1) {
            ans = 1;
            for (char cha : chars) {
                ans *= Character.getNumericValue(cha);
            }
            chars = ans.toString().toCharArray();
        }
        return ans;
    }
    
}
