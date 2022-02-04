package week_1_31_2022;

/*
 *  Given any number, we can create a new number by adding the sums of squares of digits of that number. 
 *  For example, given 203, our new number is 4 + 0 + 9 = 13.
 *  If we repeat this process, we get a sequence of numbers:
 *  203 -> 13 -> 10 -> 1 -> 1
 *  Sometimes, like with 203, the sequence reaches (and stays at) 1. Numbers like this are called happy.
 *  Not all numbers are happy. If we started with 11, the sequence would be:
 *  11 -> 2 -> 4 -> 16 -> ...
 *  This sequence will never reach 1, and so the number 11 is called unhappy.
 *  Given a positive whole number, you have to determine whether that number is happy or unhappy.
 */
public class HappyOrUnhappy {

    public static void main(String[] args) {
        System.out.println(happy(203));
        System.out.println(happy(11));
        System.out.println(happy(107));
    }
    
    public static boolean happy(int number) {
        System.out.println("Given number is " + number);
        while (number != 4) {
            String strOfNum = String.valueOf(number);
            System.out.println(strOfNum);
            int numOfDigits = strOfNum.length();
            int sumOfSquares = 0;
            for (int i = 0; i < numOfDigits; i++) {
                int digit = Character.getNumericValue(strOfNum.charAt(i));
                int square = digit * digit;
                sumOfSquares += square;
            }
            if (number == sumOfSquares) {
                return true;
            }
            number = sumOfSquares;
        }
        return false;
    }
}
