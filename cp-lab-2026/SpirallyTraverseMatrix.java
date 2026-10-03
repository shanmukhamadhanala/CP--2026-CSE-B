import java.util.Scanner;

public class SpirallyTraverseMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) matrix[row][column] = scanner.nextInt();
        }
        int top = 0, bottom = rows - 1, left = 0, right = columns - 1;
        while (top <= bottom && left <= right) {
            for (int column = left; column <= right; column++) System.out.print(matrix[top][column] + " ");
            top++;
            for (int row = top; row <= bottom; row++) System.out.print(matrix[row][right] + " ");
            right--;
            if (top <= bottom) {
                for (int column = right; column >= left; column--) System.out.print(matrix[bottom][column] + " ");
                bottom--;
            }
            if (left <= right) {
                for (int row = bottom; row >= top; row--) System.out.print(matrix[row][left] + " ");
                left++;
            }
        }
    }
}