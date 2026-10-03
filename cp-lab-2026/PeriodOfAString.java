import java.util.Scanner;

public class PeriodOfAString {
    public static void main(String[] args) {
        String value = new Scanner(System.in).next();
        int length = value.length();
        for (int period = 1; period <= length; period++) {
            if (length % period != 0) continue;
            boolean matches = true;
            for (int index = 0; index < length; index++) {
                if (value.charAt(index) != value.charAt(index % period)) {
                    matches = false;
                    break;
                }
            }
            if (matches) {
                System.out.println(period);
                break;
            }
        }
    }
}