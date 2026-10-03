import java.util.Scanner;

public class MaximumAscendingSubarraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println(0);
            return;
        }
        int previous = scanner.nextInt();
        int currentSum = previous;
        int maximumSum = previous;
        for (int index = 1; index < size; index++) {
            int value = scanner.nextInt();
            if (value > previous) currentSum += value;
            else {
                maximumSum = Math.max(maximumSum, currentSum);
                currentSum = value;
            }
            previous = value;
        }
        System.out.println(Math.max(maximumSum, currentSum));
    }
}