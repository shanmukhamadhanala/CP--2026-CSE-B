import java.util.Scanner;

public class StringHackerRank {
    private static int longestPalindromicSubsequence(String value, int left, int right) {
        if (left > right) return 0;
        if (left == right) return 1;
        if (value.charAt(left) == value.charAt(right)) {
            return 2 + longestPalindromicSubsequence(value, left + 1, right - 1);
        }
        return Math.max(longestPalindromicSubsequence(value, left + 1, right),
                longestPalindromicSubsequence(value, left, right - 1));
    }

    public static void main(String[] args) {
        String value = new Scanner(System.in).next();
        System.out.print(longestPalindromicSubsequence(value, 0, value.length() - 1));
    }
}