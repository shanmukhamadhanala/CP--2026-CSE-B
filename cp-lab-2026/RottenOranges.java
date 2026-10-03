import java.util.Scanner;

public class RottenOranges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] grid = new int[rows][columns];
        int[][] time = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                grid[row][column] = scanner.nextInt();
                time[row][column] = grid[row][column] == 2 ? 0 : grid[row][column] == 1 ? 9999 : -1;
            }
        }
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int row = 0; row < rows; row++) {
                for (int column = 0; column < columns; column++) {
                    if (grid[row][column] != 1) continue;
                    int minimum = time[row][column];
                    if (row > 0 && time[row - 1][column] != -1) minimum = Math.min(minimum, time[row - 1][column] + 1);
                    if (row < rows - 1 && time[row + 1][column] != -1) minimum = Math.min(minimum, time[row + 1][column] + 1);
                    if (column > 0 && time[row][column - 1] != -1) minimum = Math.min(minimum, time[row][column - 1] + 1);
                    if (column < columns - 1 && time[row][column + 1] != -1) minimum = Math.min(minimum, time[row][column + 1] + 1);
                    if (minimum < time[row][column]) {
                        time[row][column] = minimum;
                        changed = true;
                    }
                }
            }
        }
        int answer = 0;
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (grid[row][column] == 1) {
                    if (time[row][column] == 9999) {
                        System.out.println(-1);
                        return;
                    }
                    answer = Math.max(answer, time[row][column]);
                }
            }
        }
        System.out.println(answer);
    }
}