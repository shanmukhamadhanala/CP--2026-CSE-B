import java.util.Scanner;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        String value = new Scanner(System.in).next();
        int reported = 0;
        boolean found = false;
        for (int index = 0; index < value.length(); index++) {
            int position = value.charAt(index) - 'a';
            for (int next = index + 1; next < value.length(); next++) {
                if (value.charAt(index) == value.charAt(next)) {
                    if ((reported & (1 << position)) == 0) {
                        System.out.print(value.charAt(index) + " ");
                        reported |= 1 << position;
                        found = true;
                    }
                    break;
                }
            }
        }
        if (!found) System.out.print("No duplicates");
    }
}