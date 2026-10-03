import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        String input = scanner.nextLine();
        if (input.isEmpty()) input = scanner.nextLine();
        input = input.stripLeading();
        String pattern = scanner.next();
        boolean found = false;
        for (String word : input.split(",", -1)) {
            StringBuilder abbreviation = new StringBuilder();
            for (int index = 0; index < word.length(); index++) {
                char character = word.charAt(index);
                if (Character.isUpperCase(character)) abbreviation.append(character);
            }
            if (abbreviation.toString().startsWith(pattern)) {
                System.out.println(word);
                found = true;
            }
        }
        if (!found) System.out.print("No match found");
    }
}