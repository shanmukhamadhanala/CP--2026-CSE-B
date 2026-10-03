import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] values = new int[size];
        for (int index = 0; index < size; index++) values[index] = scanner.nextInt();
        int minimum = values[0], maximum = values[0];
        for (int value : values) {
            minimum = Math.min(minimum, value);
            maximum = Math.max(maximum, value);
        }
        for (int index = 0; index < size; index++) {
            if (values[index] == minimum) values[index] = maximum;
            else if (values[index] == maximum) values[index] = minimum;
        }
        for (int value : values) System.out.print(value + " ");
    }
}