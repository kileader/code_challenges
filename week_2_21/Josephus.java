package week_2_21;

import java.util.ArrayList;

/*
 * This classic problem dates back to Roman times. There are 41 soldiers arranged in a circle. 
 * Every third soldier is to be killed by their captors, continuing around the circle until 
 * only one soldier remains. He is to be freed. Assuming you would like to stay alive, at what position in the circle would you stand?
 * Generalize this problem by creating a function that accepts the number of soldiers n and the 
 * interval at which they are killed i, and returns the position of the fortunate survivor.
 */
public class Josephus {

    public static void main(String[] args) {
        System.out.println("josephus(41, 3) -> " + josephus(41, 3));
        System.out.println("josephus(35, 11) -> " + josephus(35, 11));
        System.out.println("josephus(11, 1) -> " + josephus(11, 1));
        System.out.println("josephus(2, 2) -> " + josephus(2, 2));
    }

    public static int josephus(int n, int i) {
        ArrayList<Integer> liveSoldiers = new ArrayList<>();
        for (int j = 1; j < n+1; j++) {
            liveSoldiers.add(j);
        }
        int index = i - 1;
        while (liveSoldiers.size() > 1) {
            while (index > liveSoldiers.size() - 1) {
                index -= liveSoldiers.size();
            }
            liveSoldiers.remove(index);
            index += i - 1;
        }
        return liveSoldiers.get(0);
    }

}
