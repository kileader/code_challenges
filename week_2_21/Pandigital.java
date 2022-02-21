package week_2_21;

/*
Take the number 192 and multiply it by each of 1, 2, and 3:
192 × 1 = 192
192 × 2 = 384
192 × 3 = 576
By concatenating each product, we get the 1 to 9 pandigital, 192384576. We will call 192384576 the concatenated product of 192 and (1,2,3)
The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4, and 5,giving the pandigital, 918273645, which is the concatenated product of 9 and(1,2,3,4,5).
What is the largest 1 to 9 pandigital 9-digit number that can be formed as the concatenated product of an integer with (1,2, ... , n) where n >1?
 */
public class Pandigital {
    public static void main(String[] args) {
        System.out.println("pandigital() -> " + pandigital());
    }
    
    public static int pandigital() {
        outer: for (int i = 9876; i > 9182; i--) {
            String concat = Integer.toString(i) + Integer.toString(i*2);
            char[] arr = concat.toCharArray();
            for (int j = 0; j < 9; j++) {
                for (int k = j+1; k < 9; k++) {
                    if (arr[j] == arr[k]) {
                        continue outer;
                    }
                }
            }
            return Integer.valueOf(concat);
        }
        return 918273645;
    }
}
