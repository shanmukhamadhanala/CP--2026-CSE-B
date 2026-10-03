import java.util.Scanner;

public class MinimumCostPath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] grid = new int[rows][columns];
        long[][] cost = new long[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) grid[row][column] = scanner.nextInt();
        }
        cost[0][0] = grid[0][0];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (row == 0 && column == 0) continue;
                if (row == 0) cost[row][column] = cost[row][column - 1] + grid[row][column];
                else if (column == 0) cost[row][column] = cost[row - 1][column] + grid[row][column];
                else cost[row][column] = Math.min(cost[row - 1][column],
                        Math.min(cost[row][column - 1], cost[row - 1][column - 1])) + grid[row][column];
            }
        }
        System.out.println(cost[rows - 1][columns - 1]);
    }
}