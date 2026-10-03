import java.util.Scanner;

public class Factorial {
    private static int factorial(int value) {
        if (value == 0 || value == 1) return 1;
        return value * factorial(value - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(new Scanner(System.in).nextInt()));
    }
}