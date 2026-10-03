import java.util.Scanner;

public class WaterJug {
    private static int gcd(int first, int second) {
        if (first == 0) return second;
        if (second == 0) return first;
        if (first % 2 == 0 && second % 2 == 0) return gcd(first / 2, second / 2);
        if (first % 2 == 0) return gcd(first / 2, second);
        if (second % 2 == 0) return gcd(first, second / 2);
        if (first > second) return gcd((first - second) / 2, second);
        if (second > first) return gcd(first, (second - first) / 2);
        return first;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int target = scanner.nextInt();
        int divisor = gcd(first, second);
        if ((first > target || second > target) && target % divisor == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}