import java.util.Scanner;

public class CountingSort2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] values = new int[size];
        int[] counts = new int[100];
        for (int index = 0; index < size; index++) {
            values[index] = scanner.nextInt();
            counts[values[index]]++;
        }
        int[] cumulative = new int[100];
        cumulative[0] = counts[0];
        for (int index = 1; index < 100; index++) cumulative[index] = cumulative[index - 1] + counts[index];
        int[] sorted = new int[size];
        for (int index = size - 1; index >= 0; index--) sorted[--cumulative[values[index]]] = values[index];
        for (int value : sorted) System.out.print(value + " ");
    }
}