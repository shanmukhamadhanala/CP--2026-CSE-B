import java.util.Scanner;

public class ExtendedEuclids {
    private static int gcdExtended(int first, int second, int[] coefficients) {
        if (second == 0) {
            coefficients[0] = 1;
            coefficients[1] = 0;
            return first;
        }
        int[] next = new int[2];
        int gcd = gcdExtended(second, first % second, next);
        coefficients[0] = next[1];
        coefficients[1] = next[0] - (first / second) * next[1];
        return gcd;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int[] coefficients = new int[2];
        int gcd = gcdExtended(first, second, coefficients);
        int stepX = second / gcd;
        int stepY = first / gcd;
        int bestX = coefficients[0];
        int bestY = coefficients[1];
        int best = Math.abs(bestX) + Math.abs(bestY);
        int firstK = -coefficients[0] / stepX;
        int secondK = coefficients[1] / stepY;
        int[] candidates = {firstK - 1, firstK, firstK + 1, secondK - 1, secondK, secondK + 1};
        for (int candidate : candidates) {
            int x = coefficients[0] + candidate * stepX;
            int y = coefficients[1] - candidate * stepY;
            int current = Math.abs(x) + Math.abs(y);
            if (current < best || (current == best && x <= y)) {
                best = current;
                bestX = x;
                bestY = y;
            }
        }
        System.out.println(bestX + " " + bestY + " " + gcd);
    }
}