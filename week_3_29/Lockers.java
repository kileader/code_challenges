package week_3_29;

/*
 * Weekly Coding Challenge:
 * Pls provide the link to your solution in the comments section not later than Friday morning.
 * 
 * 100 Lockers: There are 100 closed lockers in a hallway. A man begins by opening all 100 lockers.
 * Next, he closes every second locker. Then, on his third pass, he toggles every third locker 
 * (closes it if it is open or opens it if it is closed). This process continues for 100 passes, 
 * such that on each pass 'i', the man toggles every 'i'th locker. After his 100th pass in the hallway, 
 * in which he toggles only locker #100, how many lockers are open?
 */
public class Lockers {
    
    public static void main(String[] args) {
        System.out.println("findOpenLockers(100) -> " + findOpenLockers(100));
        System.out.println("findOpenLockers(10) -> " + findOpenLockers(10));
    }
    
    private static int findOpenLockers(int numOfLockers) {
        int ans = 0;
        int[] lockers = new int[numOfLockers]; // 0 is closed, 1 is open
        for (int i = 1; i <= numOfLockers; i++) {
            for (int j = i - 1; j <= numOfLockers - 1; j += i) {
                if (lockers[j] == 0) lockers[j] = 1;
                else lockers[j] = 0;
            }
        }
        for (int i = 0; i < numOfLockers; i++) {
            if (lockers[i] == 1) ans++;
        }
        return ans;
    }
    
}
