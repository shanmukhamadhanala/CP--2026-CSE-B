import java.util.Scanner;

public class WildCardPatterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        String pattern = scanner.next();
        int valueIndex = 0;
        int patternIndex = 0;
        while (valueIndex < value.length() && patternIndex < pattern.length()) {
            char token = pattern.charAt(patternIndex);
            if (token == '?') {
                valueIndex++;
                patternIndex++;
            } else if (token == '*') {
                patternIndex++;
                while (valueIndex < value.length() && patternIndex < pattern.length()
                        && pattern.charAt(patternIndex) != value.charAt(valueIndex)
                        && pattern.charAt(patternIndex) != '?') {
                    valueIndex++;
                }
            } else if (value.charAt(valueIndex) == token) {
                valueIndex++;
                patternIndex++;
            } else {
                System.out.print("0");
                return;
            }
        }
        while (patternIndex < pattern.length() && pattern.charAt(patternIndex) == '*') patternIndex++;
        System.out.print(valueIndex == value.length() && patternIndex == pattern.length() ? "1" : "0");
    }
}