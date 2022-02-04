package week_1_31_2022;

/*
 * A pronic number (or otherwise called as heteromecic) is a number which is a product of two consecutive integers, that is, 
 * a number of the form n(n + 1). Create a function that determines whether a number is pronic or not.
 */
public class PronicNumber {
    
    public static void main(String[] args) {
        System.out.println(isHeteromecic(0));
        System.out.println(isHeteromecic(2));
        System.out.println(isHeteromecic(7));
        System.out.println(isHeteromecic(110));
        System.out.println(isHeteromecic(136));
        System.out.println(isHeteromecic(156));
    }
    
    public static boolean isHeteromecic(int number) {
        int product = 0;
        int i;
        for (i = 0; product < number; i++) {
            product = i * (i + 1);
        }
        if (product == number) {
            return true;
        }
        return false;
    }
    
}
