import java.util.Scanner;

public class DivisionOfTwoIntegers {
    private static int divide(int dividend, int divisor) {
        long result = (long) dividend / divisor;
        if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int) result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(divide(scanner.nextInt(), scanner.nextInt()));
    }
}