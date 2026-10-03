import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        while (second != 0) {
            int carry = first & second;
            first ^= second;
            second = carry << 1;
        }
        System.out.print(first);
    }
}