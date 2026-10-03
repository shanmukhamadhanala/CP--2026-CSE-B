import java.util.Scanner;

public class BorderOfAString {
    public static void main(String[] args) {
        String value = new Scanner(System.in).next();
        for (int length = value.length() - 1; length > 0; length--) {
            if (value.substring(0, length).equals(value.substring(value.length() - length))) {
                System.out.print(value.substring(0, length));
                break;
            }
        }
    }
}