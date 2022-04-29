package week_4_25;

public class RoboPathTest {

    public static void main(String[] args) {
        RoboPath rp1 = new RoboPath(3,4);
        rp1.createObstacle(1, 0);
        rp1.createObstacle(2, 1);
        rp1.createObstacle(1, 2);
        rp1.printGrid();
    }
    
}
