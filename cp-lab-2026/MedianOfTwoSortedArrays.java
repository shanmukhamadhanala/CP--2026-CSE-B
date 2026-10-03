import java.util.Locale;
import java.util.Scanner;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstSize = scanner.nextInt();
        int secondSize = scanner.nextInt();
        int[] first = new int[firstSize];
        int[] second = new int[secondSize];
        for (int index = 0; index < firstSize; index++) first[index] = scanner.nextInt();
        for (int index = 0; index < secondSize; index++) second[index] = scanner.nextInt();
        int[] merged = new int[firstSize + secondSize];
        int left = 0, right = 0, output = 0;
        while (left < firstSize && right < secondSize) {
            merged[output++] = first[left] <= second[right] ? first[left++] : second[right++];
        }
        while (left < firstSize) merged[output++] = first[left++];
        while (right < secondSize) merged[output++] = second[right++];
        int total = merged.length;
        double median = total % 2 == 1 ? merged[total / 2]
                : ((double) merged[total / 2 - 1] + merged[total / 2]) / 2.0;
        System.out.printf(Locale.US, "%.1f%n", median);
    }
}