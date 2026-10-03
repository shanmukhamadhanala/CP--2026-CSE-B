import java.util.Scanner;

public class ToggleTheKthBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int position = scanner.nextInt();
        System.out.println(value ^ (1 << position));
    }
}