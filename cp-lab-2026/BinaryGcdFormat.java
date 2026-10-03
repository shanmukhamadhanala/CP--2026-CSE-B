import java.util.Scanner;

public class BinaryGcdFormat {
    private static int binaryGcd(int first, int second) {
        if (first == 0) return second;
        if (second == 0) return first;
        if (first % 2 == 0 && second % 2 == 0) return 2 * binaryGcd(first / 2, second / 2);
        if (first % 2 == 0) return binaryGcd(first / 2, second);
        if (second % 2 == 0) return binaryGcd(first, second / 2);
        if (first > second) return binaryGcd((first - second) / 2, second);
        if (second > first) return binaryGcd(first, (second - first) / 2);
        return first;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(binaryGcd(scanner.nextInt(), scanner.nextInt()));
    }
}