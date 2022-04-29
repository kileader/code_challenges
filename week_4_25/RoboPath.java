package week_4_25;

/*
 * Robot in a Grid: Imagine a robot sitting on the upper left corner
 * of grid with r rows and c columns. The robot can only move in two
 * directions, right and down, but certain cells are "off limits" such
 * that the robot cannot step on them. Design an algorithm to find a
 * path for the robot from the top left to the bottom right.
 */
public class RoboPath {
    
    private int rows;
    private int cols;
    private int[][] grid;
    private 
    
    
    public RoboPath(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        grid = new int[rows][cols];
    }
    
    public void createObstacle(int x, int y) {
        grid[x][y] = -1;
    }
    
    public void printGrid() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public void findPath() {
        int x = 0;
        int y = 0;
        while (x != rows-1 && y != cols-1) {
            while (x != rows-1) {
                if (grid[x][y] == 0 && grid[x+1][y] == 0) {
                    grid[x][y] = 1;
                    x++;
                } else if (grid[x][y] == 0 && grid[])
            }
            
        }
    }
    
}
