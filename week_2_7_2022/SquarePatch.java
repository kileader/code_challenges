package week_2_7_2022;

/*
 * Create a function that takes an integer and outputs an n x n square solely consisting of the integer n.
 */
public class SquarePatch {
    
    public static void main(String[] args) {
        System.out.println("squarePatch(3) -->\n" + squarePatch(3));
        System.out.println("squarePatch(5) -->\n" + squarePatch(5));
        System.out.println("squarePatch(1) -->\n" + squarePatch(1));
        System.out.println("squarePatch(0) -->\n" + squarePatch(0));
    }
    
    private static String squarePatch(int n) {
        String nStr = Integer.toString(n);
        String row = "";
        for (int i = 0; i < n; i++) {
            row += nStr;
        }
        String ans = row;
        for (int j = 1; j < n; j++) {
            ans += "\n" + row;
        }
        return ans;
    }
    
}
