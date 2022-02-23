package week_2_21;

import java.util.ArrayList;

public class Decimate {

    public static void main(String[] args) {
        System.out.println("decimate(41, 3) -> " + decimate(41, 3));
        System.out.println("decimate(35, 11) -> " + decimate(35, 11));
        System.out.println("decimate(11, 1) -> " + decimate(11, 1));
        System.out.println("decimate(2, 2) -> " + decimate(2, 2));
    }

    public static int decimate(int n, int i) {
        ArrayList<Integer> liveSoldiers = new ArrayList<>();
        for (int j = 1; j < n+1; j++) {
            liveSoldiers.add(j);
        }
        int index = i - 1;
        while (liveSoldiers.size() > 1) {
            if (index > liveSoldiers.size() - 1) {
                while (index > liveSoldiers.size() - 1) {
                    index -= liveSoldiers.size();
                }
            }
            liveSoldiers.remove(index);
            index += i - 1;
        }
        return liveSoldiers.get(0);
    }

}
