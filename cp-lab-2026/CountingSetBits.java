import java.util.Scanner;

public class CountingSetBits {
    public static void main(String[] args) {
        int value = new Scanner(System.in).nextInt();
        int count = 0;
        while (value > 0) {
            value &= value - 1;
            count++;
        }
        System.out.print(count);
    }
}