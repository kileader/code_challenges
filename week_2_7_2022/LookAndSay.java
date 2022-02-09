package week_2_7_2022;

import java.math.BigInteger;

/*
 * Given an integer value, return a new integer according to the rules below:
 *
 * -Split the number into groups of two digit numbers. If the number has an odd number of digits, return -1.
 * -For each group of two digit numbers, concatenate the last digit to a new string the same number of times as the value of the first digit.
 * -Return the result as an integer.
 *
 * lookAndSay(3132) ➞ 111222
 *
 * By reading the number digit by digit, you get three "1" and three "2".
 * Therefore, you put three ones and three two's together.
 * Remember to return an integer value (i.e BigIntger class).
 */
public class LookAndSay {

    public static void main(String[] args) {
        BigInteger one = new BigInteger("1213200012171979");
        BigInteger two = new BigInteger("54544666");
        BigInteger three = new BigInteger("95");
        BigInteger four = new BigInteger("1213141516171819");
        BigInteger five = new BigInteger("120520");
        BigInteger six = new BigInteger("231");
        System.out.println("lookAndSay(1213200012171979) -> " + lookAndSay(one));
        System.out.println("lookAndSay(54544666) -> " + lookAndSay(two));
        System.out.println("lookAndSay(95) -> " + lookAndSay(three));
        System.out.println("lookAndSay(1213141516171819) -> " + lookAndSay(four));
        System.out.println("lookAndSay(120520) -> " + lookAndSay(five));
        System.out.println("lookAndSay(231) -> " + lookAndSay(six));
    }

    private static BigInteger lookAndSay(BigInteger given) {
        String givStr = given.toString();
        if (givStr.length() % 2 == 1) {
            return BigInteger.valueOf(-1L);
        }
        char[] chars = givStr.toCharArray();
        String ansStr = "";
        for (int i = 0; i < chars.length; i += 2) {
            int times = Integer.parseInt(String.valueOf(chars[i]));
            for (int j = 0; j < times; j++) {
                ansStr += chars[i+1];
            }
        }
        BigInteger ans = new BigInteger(ansStr);
        return ans;
    }

}
