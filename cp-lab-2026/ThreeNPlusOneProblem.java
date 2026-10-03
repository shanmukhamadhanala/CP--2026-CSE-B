import java.util.Scanner;

public class ThreeNPlusOneProblem {
    private static int cycleLength(int value) {
        int count = 1;
        while (value != 1) {
            if (value % 2 == 0) {
                value /= 2;
            } else {
                value = 3 * value + 1;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int last = scanner.nextInt();
        int originalFirst = first;
        int originalLast = last;
        if (first > last) {
            int temporary = first;
            first = last;
            last = temporary;
        }
        int maximumLength = 0;
        for (int value = first; value <= last; value++) {
            maximumLength = Math.max(maximumLength, cycleLength(value));
        }
        System.out.print(originalFirst + " " + originalLast + " " + maximumLength);
    }
}