import java.util.Scanner;

public class MaxSubArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int currentSum = scanner.nextInt();
        int maximumSum = currentSum;
        for (int index = 1; index < size; index++) {
            int value = scanner.nextInt();
            currentSum = Math.max(value, currentSum + value);
            maximumSum = Math.max(maximumSum, currentSum);
        }
        System.out.println(maximumSum);
    }
}