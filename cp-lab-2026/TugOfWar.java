import java.util.Scanner;

public class TugOfWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] values = new int[size];
        int sum = 0;
        for (int index = 0; index < size; index++) {
            values[index] = scanner.nextInt();
            sum += values[index];
        }
        int minimumDifference = values[0];
        for (int firstPart = 0; firstPart <= sum; firstPart++) {
            int difference = Math.abs(firstPart - (sum - firstPart));
            if (difference < minimumDifference) minimumDifference = difference;
        }
        System.out.print(minimumDifference);
    }
}