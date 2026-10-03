import java.util.Scanner;

public class DivisionWithBinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividend = scanner.nextInt();
        int divisor = scanner.nextInt();
        if (divisor == 0) {
            System.out.print("Division by zero not possible");
            return;
        }
        int low = 0;
        int high = dividend;
        while (low <= high) {
            int middle = (low + high) / 2;
            long product = (long) middle * divisor;
            if (product == dividend) {
                System.out.print(middle);
                return;
            } else if (product < dividend) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
    }
}