package week_2_7_2022;

/*
 * Write a function that returns true if a string consists of ascending or ascending AND consecutive numbers.
 */
public class Ascending {
    
    public static void main(String[] args) {
        System.out.println("ascending(\"232425\") --> " + ascending("232425"));
        System.out.println("ascending(\"2324256\") --> " + ascending("2324256"));
        System.out.println("ascending(\"444445\") --> " + ascending("444445446"));
    }
    
    private static boolean ascending(String str) {
        addDigit: for (int digits = 1; digits < str.length()/2 + 1; digits++) {
            String substr =  str.substring(0, digits);
            if (str.length() % digits == 0) {
                int iterations = str.length() / digits;
                int prevNum = Integer.parseInt(substr);
                int prevEnd = digits;
                for (int i = 2; i < iterations + 1; i++) {
                    if (Integer.parseInt(str.substring(prevEnd, prevEnd + digits)) != prevNum + 1) {
                        continue addDigit;
                    }
                    prevNum++;
                    prevEnd += digits;
                }
                return true;
            }
        }
        return false;
    }
}
