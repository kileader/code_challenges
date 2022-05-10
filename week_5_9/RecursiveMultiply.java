package week_5_9;

/*
 * 3) Recursive Multiply: Write a recursive function to multiply two positive integers without using the *operator.
 * You can use addition, subtraction, and bit shifting, but you should minimize the number of those operations.
 */
public class RecursiveMultiply {
    
    public static void main(String[] args) {
        System.out.println("multiplyRecursively(2, 3) -> " + multiplyRecursively(2, 3));
        System.out.println("multiplyRecursively(0, 10) -> " + multiplyRecursively(0, 10));
        System.out.println("multiplyRecursively(5, -6) -> " + multiplyRecursively(5, -6));
    }
    
    // Negative multiplication is easy so I included that
    static int multiplyRecursively(int x, int y) {
        if (x == 0 || y == 0) {
            return 0;
        } else if (y > 0) {
            return x + multiplyRecursively(x, y - 1);
        } else {
            return -multiplyRecursively(x, -y);
        }
    }
}
