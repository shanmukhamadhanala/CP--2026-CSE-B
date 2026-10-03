import java.util.Arrays;
import java.util.Scanner;

public class CoinChangeProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        int count = scanner.nextInt();
        int[] coins = new int[count];
        for (int index = 0; index < count; index++) coins[index] = scanner.nextInt();
        int[] minimum = new int[target + 1];
        Arrays.fill(minimum, Integer.MAX_VALUE);
        minimum[0] = 0;
        for (int amount = 1; amount <= target; amount++) {
            for (int coin : coins) {
                if (coin <= amount && minimum[amount - coin] != Integer.MAX_VALUE) {
                    minimum[amount] = Math.min(minimum[amount], minimum[amount - coin] + 1);
                }
            }
        }
        System.out.println(minimum[target] == Integer.MAX_VALUE ? -1 : minimum[target]);
    }
}