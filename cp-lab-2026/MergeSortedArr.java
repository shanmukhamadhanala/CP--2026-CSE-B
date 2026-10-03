import java.util.Scanner;

public class MergeSortedArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstSize = scanner.nextInt();
        int[] first = new int[firstSize];
        for (int index = 0; index < firstSize; index++) first[index] = scanner.nextInt();
        int secondSize = scanner.nextInt();
        int[] second = new int[secondSize];
        for (int index = 0; index < secondSize; index++) second[index] = scanner.nextInt();
        int[] merged = new int[firstSize + secondSize];
        int left = 0, right = 0, output = 0;
        while (left < firstSize && right < secondSize) {
            merged[output++] = first[left] <= second[right] ? first[left++] : second[right++];
        }
        while (left < firstSize) merged[output++] = first[left++];
        while (right < secondSize) merged[output++] = second[right++];
        for (int value : merged) System.out.print(value + " ");
    }
}