import java.util.Arrays;
import java.util.Scanner;

public class Majority {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] values = new int[size];
        for (int index = 0; index < size; index++) values[index] = scanner.nextInt();
        Arrays.sort(values);
        int candidate = values[size / 2];
        int count = 0;
        for (int value : values) if (value == candidate) count++;
        System.out.print(count > size / 2 ? candidate : -1);
    }
}